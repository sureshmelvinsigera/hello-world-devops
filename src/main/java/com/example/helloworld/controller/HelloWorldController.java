package com.example.helloworld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public ResponseEntity<Map<String, String>> getHelloWorld() {
        Map<String, String> response = Map.of("message", "Hello World");
        return ResponseEntity.ok(response);
    }
}
