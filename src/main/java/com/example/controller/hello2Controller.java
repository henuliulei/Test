package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello2Controller {

    @RequestMapping("/test")
    public void test(){
        System.out.println("hello");
    }

}
