package com.example.demo.controllers;

import com.example.demo.entity.Course;

import com.example.demo.services.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping("/courses")
    public String showCourses(Model model) {
        List<Course> courses = service.getAllCourses();
        model.addAttribute("courses", courses);
        return "courses";
    }

    @PostMapping("/enroll/{courseId}")
    @ResponseBody
    public ResponseEntity<String> enrollCourse(@PathVariable Long courseId,
                                               @RequestBody PaymentDetails paymentDetails) {
        try {
            // Validate payment details
            // Process payment (in a real app, use a payment processor like Stripe)
            // Enroll user in course

            return ResponseEntity.ok("Enrollment successful");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Payment failed: " + e.getMessage());
        }
    }

    // Inner class for payment details
    public static class PaymentDetails {
        private String cardNumber;
        private String cardName;
        private String expiryDate;
        private String cvv;

        // Getters and setters
        public String getCardNumber() { return cardNumber; }
        public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
        public String getCardName() { return cardName; }
        public void setCardName(String cardName) { this.cardName = cardName; }
        public String getExpiryDate() { return expiryDate; }
        public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }
        public String getCvv() { return cvv; }
        public void setCvv(String cvv) { this.cvv = cvv; }
    }
}