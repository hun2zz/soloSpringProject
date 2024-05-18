package com.spring.solo.mood.controller;

import com.spring.solo.mood.dto.UserDto;
import com.spring.solo.mood.entity.User;
import com.spring.solo.mood.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.plugin.codec.LocalDateCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Rollback
class UserControllerTest {
    LocalDateTime local;

    @Autowired
    UserRepository userRepository;
    @Test
    void save() {
        User user = new User("1", "d", "3", "3", "4", "5", 3, "1", local);
        userRepository.save(user);
    }
}