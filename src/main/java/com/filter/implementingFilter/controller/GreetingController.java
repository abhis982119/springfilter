package com.filter.implementingFilter.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping("/user")
    public String greet(@RequestParam(required = false) String name, HttpSession session){
        System.out.println("Inside greeting controller");
        session.setAttribute("userName", name);
        return "Hello Mr. " + name;
    }
}
