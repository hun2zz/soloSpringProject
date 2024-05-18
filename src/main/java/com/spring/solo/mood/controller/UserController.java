package com.spring.solo.mood.controller;


import com.spring.solo.mood.dto.UserDto;
import com.spring.solo.mood.entity.User;
import com.spring.solo.mood.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mood/*")
@RequiredArgsConstructor

public class UserController {
    public final UserRepository userRepository;


    @GetMapping("list")
    public String list () {
        System.out.println("ㄴㄴ");
        return "reg_form";
    }

    @PostMapping("save")
    public String save(UserDto user) {
        User user1 = new User(user);
        userRepository.save(user1);
        return "redirect:/reg_form";
    }
}
