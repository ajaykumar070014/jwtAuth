package com.security.Auth.service;

import com.security.Auth.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<UserModel>store=new ArrayList<>();

    public UserService() {
        store.add(new UserModel(UUID.randomUUID().toString(),"Ajay Kumar","ajaykumar@gmail.com"));
        store.add(new UserModel(UUID.randomUUID().toString(),"Shiv Naren","shivnaren@gmail.com"));
        store.add(new UserModel(UUID.randomUUID().toString(),"Sri Krishna","srikrishna@gmail.com"));
    }
    public List<UserModel>getUsers(){
        return this.store;
    }
}
