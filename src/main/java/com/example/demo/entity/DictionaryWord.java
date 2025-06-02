package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "dictionary_words")
public class DictionaryWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String kazakh;
    private String russian;
    private String english; // Optional, for future expansion

    // Constructors, getters, and setters
    public DictionaryWord() {}

    public DictionaryWord(String kazakh, String russian) {
        this.kazakh = kazakh;
        this.russian = russian;
    }

}