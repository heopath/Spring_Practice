package org.example.ch05.controller;


import lombok.RequiredArgsConstructor;
import org.example.ch05.dto.User1DTO;
import org.example.ch05.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RequiredArgsConstructor
@Controller
public class User1Controller {

    // @RequiredArgsConstructor 어노테이션으로 의존객체 주입 ⭐⭐⭐⭐⭐
    private final User1Service service;

    @GetMapping("/user1/list")
    public String list(){
        return "/user1/list";
    }

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @PostMapping("/user1/register")
    public String register(User1DTO dto){
        System.out.println(dto);
        
        // 등록 서비스 호출
        service.register(dto);


        return "redirect:/user1/list";
    }



    @GetMapping("/user1/modify")
    public String modify(){
        return "/user1/modify";
    }
}
