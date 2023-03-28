package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//123
        @Controller

public class SampleController {
    @RequestMapping(value = "/main")
    public String main(){
        System.out.println("sssss");
        return "index.html";
    }
}
