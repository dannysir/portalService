package kr.ac.jejunu.user;

import kr.ac.jejunu.user.User;

import java.sql.*;

public class UserDao {
    public User findById(Long id) throws SQLException, ClassNotFoundException {
        // 데이터 위치? mysql

        //mysql 클래스 로딩
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connection
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost/jeju","root", "s26977962");
        //쿼리 만들기
        PreparedStatement preparedStatement = connection.prepareStatement
                ("select id, name, password from userinfo where ?");
        preparedStatement.setLong(1, id);
        //쿼리 실행
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        //결과를 사용자 정보에 매핑
        User user = new User();
        user.setId(resultSet.getLong("id"));
        user.setName(resultSet.getString("name"));
        user.setPassword(resultSet.getString("password"));

        //자원해지
        resultSet.close();
        preparedStatement.close();
        connection.close();
        //결과리턴
        return user;
    }
}
