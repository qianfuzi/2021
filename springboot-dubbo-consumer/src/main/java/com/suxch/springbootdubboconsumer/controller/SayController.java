package com.suxch.springbootdubboconsumer.controller;

import com.alibaba.fastjson.JSON;
import com.suxch.springbootdubboconsumer.service.SayService;
import com.suxch.springbootdubboconsumer.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class SayController {
    @Autowired
    private SayService sayService;
    @Autowired
    private UserSearchService userSearchService;

    @RequestMapping("/hello")
    public String say(@RequestParam("name") String name){
        return sayService.say(name);
    }

    @RequestMapping("/searchUser")
    public String say(@RequestParam("id") int id){
        return JSON.toJSONString(userSearchService.findUserById(id));
    }
}
