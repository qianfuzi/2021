package com.suxch.db.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.suxch.db.entity.User;
import com.suxch.db.mapper.UserMapper;
import com.suxch.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }
}
