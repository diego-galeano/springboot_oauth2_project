package com.fullbackend.security.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController 
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello security World");
    }
    
}
