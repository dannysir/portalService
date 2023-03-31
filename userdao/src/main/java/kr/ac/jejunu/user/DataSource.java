package kr.ac.jejunu.user;

import java.sql.Connection;
import java.sql.SQLException;

public interface DataSource {//    abstract public Connection getConnection() throws ClassNotFoundException, SQLException ;

    public  Connection getConnection() throws ClassNotFoundException, SQLException;
//    public static Connection getConnection() throws ClassNotFoundException, SQLException {
//        //mysql 클래스 로딩
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        //connection
//        Connection connection = DriverManager.getConnection
//                ("jdbc:mysql://localhost/jeju", "root", "s26977962");
//        return connection;
//    }
}