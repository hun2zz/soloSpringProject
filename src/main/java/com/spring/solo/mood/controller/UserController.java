package com.spring.solo.mood.controller;

import com.spring.solo.mood.dto.UserDto;
import com.spring.solo.mood.entity.User;
import com.spring.solo.mood.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

@Controller
@RequestMapping("/mood/*")
@RequiredArgsConstructor

public class UserController {
    public final UserRepository userRepository;


    @GetMapping("list")
    public String list () {
        System.out.println("ㄴㄴ");
        return "/board/reg_form";
    }

    @PostMapping("save")
    public String save(UserDto user) {
        User user1 = new User(user);
        if (userRepository.registerIdFind(user1)) {
            System.out.println("이미 존재하는 ID입니다!");
            return "redirect:/mood/list"; // 이미 존재하면 같은 폼으로 리다이렉트
        } else {
            userRepository.save(user1);
            System.out.println("성공적으로 저장되었습니다.");
            return "redirect:/mood/list"; // 저장 후 리스트 페이지로 리다이렉트
        }
    }
}
