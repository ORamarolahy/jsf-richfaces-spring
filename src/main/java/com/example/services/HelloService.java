package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getMessage() {
        return "Bonjour depuis Spring !";
    }
}