package com.jwt.example.service;

import com.jwt.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> allUsersAsList = new ArrayList<>();

    public UserService() {
        allUsersAsList.add(new User(UUID.randomUUID().toString(), "Ram Kr", "ram@gmail.com"));
        allUsersAsList.add(new User(UUID.randomUUID().toString(), "Shyam Kr", "shyam@gmail.com"));
        allUsersAsList.add(new User(UUID.randomUUID().toString(), "Gita Kr", "gita@gmail.com"));
    }

    public List<User> getAllUsers(){
        return this.allUsersAsList;
    }

}
