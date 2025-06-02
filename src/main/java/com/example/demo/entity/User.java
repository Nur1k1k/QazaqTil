package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@Table(name="users")
public class User {
    @Id @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private String role = "ROLE_USER";



    public User(Long id, String username, String password, String role){
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;

    }
}