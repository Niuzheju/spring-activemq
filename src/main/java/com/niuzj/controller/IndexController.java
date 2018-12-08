package com.niuzj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @RequestMapping("/test01")
    public String test01(){
        return jmsTemplate.toString();
    }
}
