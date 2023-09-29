package com.msil.simpleRest.service;

import com.msil.simpleRest.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> get();
    String deleteUser();
}
