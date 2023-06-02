package kr.ac.jejunu.user.userdao3;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "userinfo")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;

}
