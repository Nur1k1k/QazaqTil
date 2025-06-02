package com.example.demo.controllers;

import com.example.demo.entity.User;
import com.example.demo.repositories.DictionaryWordRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private DictionaryWordRepository dictionaryWordRepository;

    @GetMapping("/dictionary")
    public String dictionary(Model model) {
        model.addAttribute("words", dictionaryWordRepository.findAll());
        return "dictionary";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "redirect:/login";
    }

    @GetMapping("/profile")
    public String profile(Principal principal, Model model) {
        model.addAttribute("username", principal.getName());
        return "profile";
    }

    @GetMapping("/topics")
    public String topics() {
        return "topics";
    }

    @GetMapping("/tests")
    public String tests() {
        return "tests";
    }

    @GetMapping("/courses")
    public String courses() {
        return "courses";
    }

}
