package com.example.securitydemo.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("users")
public class User {

    @Id
    private String id;

    private String userName;

    private String password;

    private Employee user;

    private List<String> authority;

   public User(String userName,String password, Employee employee, List<String> authority) {
        this.userName = userName;
        this.password = password;
        this.user = employee;
        this.authority = authority;
    }
}
