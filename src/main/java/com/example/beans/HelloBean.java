package com.example.beans;

import com.example.services.HelloService;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class HelloBean {

    @Inject
    private HelloService helloService;

    public String getMessage() {
        return helloService.getMessage();
    }
}