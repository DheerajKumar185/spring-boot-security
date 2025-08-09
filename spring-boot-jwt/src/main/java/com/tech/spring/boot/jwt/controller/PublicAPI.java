package com.tech.spring.boot.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PublicAPI {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!! This api is publicly accessible";
    }
}
