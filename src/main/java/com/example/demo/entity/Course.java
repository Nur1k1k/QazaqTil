package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String level; // "Beginner", "Intermediate", "Advanced"
    private Double rating; // 0.0 to 5.0
    private Integer studentsCount; // Number of enrolled students
    private String duration; // e.g. "8 weeks"

    // Конструкторы
    public Course() {}

    public Course(String title, String content) {
        this.title = title;
        this.content = content;
        this.level = "Beginner";
        this.rating = 4.5;
        this.studentsCount = 0;
        this.duration = "6 weeks";
    }

    // Геттеры и сеттеры
    public Long getId() { return id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }

    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }

    public Integer getStudentsCount() { return studentsCount; }
    public void setStudentsCount(Integer studentsCount) { this.studentsCount = studentsCount; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
}