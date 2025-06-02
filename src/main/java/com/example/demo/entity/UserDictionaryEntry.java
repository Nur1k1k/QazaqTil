package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_dictionary")
public class UserDictionaryEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private DictionaryWord word;

    private String note;
}