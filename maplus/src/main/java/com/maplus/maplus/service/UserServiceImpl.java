package com.maplus.maplus.service;

import com.maplus.maplus.model.User;
import com.maplus.maplus.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;

    @Override
    public boolean userRegister(User user){
        userRepo.save(user);
        return true;
    }




    
    
}