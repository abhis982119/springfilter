package com.filter.implementingFilter.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public String getHealthStatus(@RequestParam(required = false) String name,  HttpSession session){
        session.setAttribute("name",  name);
        return "service is up";
    }
}
