package com.example.demo.services;

import com.example.demo.entity.Course;
import com.example.demo.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    public void addCourse(Course course) {
        repository.save(course);
    }
}