package com.tech.spring.boot.jwt.controller;

import com.tech.spring.boot.jwt.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/secure")
public class SecureAPI {

    @GetMapping("/employee")
    public ResponseEntity<Employee> hello() {
        Employee emp = new Employee(1, "Dheeraj", "IT", 1.5);
        return ResponseEntity.ok(emp);
    }
}