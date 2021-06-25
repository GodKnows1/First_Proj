package com.example.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    UserRepository userrepo;
    void save(){
        User user =new User();
        user.setName("Gaurav");
        userrepo.save(user);
    }

    User get(){
        return new User();
    }
}
