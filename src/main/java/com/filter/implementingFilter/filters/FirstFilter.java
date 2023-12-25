package com.filter.implementingFilter.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Map;

public class FirstFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        System.out.println("Inside firstfilter");

        HttpSession session =  request.getSession();

        if(session == null || session.getAttribute("name") != null){
            System.out.println("session name found : " + session.getAttribute("name") );
            filterChain.doFilter(request, response);
        }else{
            response.sendRedirect("/login");
        }

    }
}
