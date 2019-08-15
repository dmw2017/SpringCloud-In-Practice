package com.chinaunicom.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WAI CHAN
 * @Date: 19-8-3 上午11:00
 */
@RestController
public class HelloWorldController {

    @Value("${server.port}")
    String port;

    @GetMapping("/helloWorld")
    public String helloWorld(@RequestParam String name) {
        return "HelloWorld " + name + ",i am from port:" + port;
    }
}
