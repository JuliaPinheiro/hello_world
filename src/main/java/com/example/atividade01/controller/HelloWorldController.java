package com.example.atividade01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class HelloWorldController {
        @GetMapping("/ola")
        public String helloWorld() {
            return "Hello World";
        }
    }

