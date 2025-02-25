package com.ex01.myspring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//import jakarta.servlet.http.HttpServletRequest; // spring 6, tomcat 10
import javax.servlet.http.HttpServletRequest; // spring 5, tomcat 9 (spring framework 2.7.5 ver.)

@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(HttpServletRequest request) {
        return "hello";
    }
}
