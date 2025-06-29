package com.qh.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maqiangfei
 * @since 2025/4/20 13:51
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
}
