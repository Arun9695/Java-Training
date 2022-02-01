package com.dxc.demoapp1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello from spring boot";
    }


    @GetMapping("/hello/{name}")
    public String helloname(@PathVariable String name) {
        return "Hello from spring boot," + name;
    }

    
    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2) {
        return "The sum =" +(num1 + num2);
    }

}
