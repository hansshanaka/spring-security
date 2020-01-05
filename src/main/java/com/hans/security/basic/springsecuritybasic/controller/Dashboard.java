package com.hans.security.basic.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dashboard {

    @GetMapping("/")
    public String appLoad(){
        return "Welcome";
    }
}
