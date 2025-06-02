package com.example.demo.repositories;

import com.example.demo.entity.UserDictionaryEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDictionaryRepository extends JpaRepository<UserDictionaryEntry, Long> {}
