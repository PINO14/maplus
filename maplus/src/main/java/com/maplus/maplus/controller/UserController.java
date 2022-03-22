package com.maplus.maplus.controller;

import com.maplus.maplus.model.User;
import com.maplus.maplus.repo.UserRepo;
import com.maplus.maplus.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;
    
    //用户注册
    @PostMapping(value = "userRegister")
    public boolean saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
