package com.rest.restunittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/message")
    public String message() {
        return "Welcome";
    }
}
