package com.ziv.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitDemoWebApplication.class,args);
        sayHello();
    }

    public static  void sayHello(){
        System.err.println("hello git");
    }
}
