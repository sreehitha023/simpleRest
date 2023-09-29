package com.msil.simpleRest.service.impl;

import com.msil.simpleRest.entity.User;
import com.msil.simpleRest.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    public List<User> UserList = new ArrayList<>();

    public User save(User user) {
        UserList.add(user);
        return user;
    }

    public List<User> get() {
        return UserList;
    }

    public String deleteUser()
    {
        return "Success";
    }
        public User findById(long id) {
            for (User user : UserList) {
                if (user.getId() == id) {
                    return user;
                }
            }
            return null; // User not found
        }

        // Update a user by ID
        public User update(long id, User updatedUser) {
            User existingUser = findById(id);

            if (existingUser != null) {
                // Update user details with the provided values
                existingUser.setUsername(updatedUser.getUsername());
                return existingUser; // Return the updated user
            } else {
                return null; // User not found, update failed
            }
        }
}