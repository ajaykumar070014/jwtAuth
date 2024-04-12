package com.security.Auth.controller;

import com.security.Auth.model.UserModel;
import com.security.Auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("users")
    public List<UserModel> getUser(){
        System.out.println("Getting Users");
        return this.userService.getUsers();
    }
}
