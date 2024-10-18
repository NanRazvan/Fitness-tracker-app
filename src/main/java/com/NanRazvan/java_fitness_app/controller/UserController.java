package com.NanRazvan.java_fitness_app.controller;

import com.NanRazvan.java_fitness_app.entity.User;
import com.NanRazvan.java_fitness_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/testUser")
    public String testUser() {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john@example.com");
        user.setAge(25);
        user.setHeight(1.80);
        user.setWeight(75.0);
        userRepository.save(user);

//        model.addAttribute("users", userRepository.findAll());
        return "users";
    }
}
