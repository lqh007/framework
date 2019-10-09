package com.seven.security.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Autowired
    private HelloSender helloSender;
    @GetMapping("sendMsg")
    public void sendMsg(){
        for (int i=0;i<10;i++){
            helloSender.send(i);
        }
    }
}
