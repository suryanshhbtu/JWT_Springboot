package com.springboot.myjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @GetMapping("/")
    public String home(){
        return "home";
    }
}
