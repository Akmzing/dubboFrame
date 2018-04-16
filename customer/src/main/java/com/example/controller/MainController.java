package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    DemoService demoService;

    @RequestMapping("hello")
    @ResponseBody
    public String helloworld(){
        return demoService.SayHello("DUBBO");
    }

    @RequestMapping("wta")
    public String woe(){
        return "index";
    }
}
