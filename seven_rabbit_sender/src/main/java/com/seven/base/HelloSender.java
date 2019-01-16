package com.seven.base;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {


    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        String context = "hello " + new Date()+"============="+i;
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }



}
