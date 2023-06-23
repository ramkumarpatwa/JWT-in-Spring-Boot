package com.jwt.example.controller;

import com.jwt.example.model.User;
import com.jwt.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getAllUsers();
    }

}
