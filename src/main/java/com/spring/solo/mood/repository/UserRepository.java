package com.spring.solo.mood.repository;

import com.spring.solo.mood.entity.User;

public interface UserRepository {
    boolean save(User user);

    boolean registerIdFind(User user);
}
