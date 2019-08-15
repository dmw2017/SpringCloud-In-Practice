package com.chinaunicom.eurekafeignclient.controller;

import com.chinaunicom.eurekafeignclient.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WAI CHAN
 * @Date: 19-8-3 下午3:28
 */
@RestController
public class HelloWorldController {
    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("/helloWorld")
    public String sayHelloWorld(@RequestParam(defaultValue = "forezp", required = false)String name) {
        return helloWorldService.sayHelloWorld(name);
    }
}
