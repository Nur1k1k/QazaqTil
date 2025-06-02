package com.example.demo.repositories;

import com.example.demo.entity.DictionaryWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictionaryWordRepository extends JpaRepository<DictionaryWord, Long> {}
