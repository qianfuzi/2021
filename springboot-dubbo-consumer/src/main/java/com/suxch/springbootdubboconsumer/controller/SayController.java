package com.suxch.springbootdubboconsumer.controller;

import com.suxch.springbootdubboconsumer.service.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class SayController {
    @Autowired
    private SayService sayService;

    @RequestMapping("/hello")
    public String say(@RequestParam("name") String name){
        return sayService.say(name);
    }
}
