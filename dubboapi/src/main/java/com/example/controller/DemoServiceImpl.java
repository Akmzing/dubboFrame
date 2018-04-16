package com.example.controller;

public class DemoServiceImpl implements DemoService {

    @Override
    public String SayHello(String name) {
        return "hello " + name;
    }
}
