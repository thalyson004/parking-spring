package com.parking.dio.parking.dio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping
    public String Home(){
        return "Hello!";
    }
}
