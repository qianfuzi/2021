package com.suxch.springbootdubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.suxch.springbootdubboprovider.service.SayHello;
@Service
public class SayHelloImpl implements SayHello {
    @Override
    public String sayHello(String name) {
        return "Hello "+ name;
    }
}
