package org.example.ch05.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class User1Controller {

    @GetMapping("/user1/list")
    public String list(){
        return "/user1/list";
    }

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @GetMapping("/user1/modify")
    public String modify(){
        return "/user1/modify";
    }
}
