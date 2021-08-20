package com.suxch.springbootdubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.suxch.db.entity.User;
import com.suxch.db.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserSearchService {
    @Reference
    private UserService userService;

    public User findUserById(int id){
       return userService.findUserById(id);
    }
}
