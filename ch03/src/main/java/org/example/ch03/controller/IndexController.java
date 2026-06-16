package org.example.ch03.controller;

import org.example.ch03.DTO.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;

@Controller
public class IndexController {

    @GetMapping(value ={"/", "/index"})
    public String index(Model model){
        System.out.println("index...");

        // 템플릿 출력 변수
        int num1 = 123;
        double num2 = 2.13;
        String str1 = "Hello Spring Boot!";
        String str2 = "Welcome";

        // DTO 생성 - 생성자 초기화
        UserDTO user1 = new UserDTO("a101", "김유신", "1999-01-12", 32);

        // DTO 생성 - 세터 초기화
        UserDTO user2 = new UserDTO();
        user2.setUserid("a102");
        user2.setName("김춘추");
        user2.setBirth("1992-02-11");
        user2.setAge(11);

        // DTO 생성 - 빌터 초기화
        UserDTO user3 = UserDTO.builder()
                                .userid("a103")
                                .name("장보고")
                                .birth("1993-09-39")
                                .age(22)
                                .build();


        // Model 참조: Controller 컴포넌트 데이터를 View(HTML)에서 참조
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("str1", str1);
        model.addAttribute("str2", str2);
        model.addAttribute("user1", user1);
        model.addAttribute("user2", user2);
        model.addAttribute("user3", user3);

        return "/index";
    }
}
