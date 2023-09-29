package com.msil.simpleRest.controller;

import com.msil.simpleRest.entity.User;
import com.msil.simpleRest.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping
    public User add(@RequestBody User user) {
        return userServiceImpl.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userServiceImpl.get();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userServiceImpl.deleteUser();
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User updatedUser) {
        User updated = userServiceImpl.update(id, updatedUser);
        if (updated != null) {
            return "SUCCESS";
        } else {
            return "NOT FOUND";
        }
    }
}
