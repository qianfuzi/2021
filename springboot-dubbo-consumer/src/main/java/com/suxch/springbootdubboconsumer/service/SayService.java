package com.suxch.springbootdubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.suxch.springbootdubboprovider.service.SayHello;
import org.springframework.stereotype.Component;

@Component
public class SayService {
    @Reference
    SayHello sayHello;

    public String say(String name){
        return sayHello.sayHello(name);
    }
}
