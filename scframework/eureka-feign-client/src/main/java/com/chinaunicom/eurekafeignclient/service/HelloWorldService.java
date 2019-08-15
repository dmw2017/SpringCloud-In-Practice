package com.chinaunicom.eurekafeignclient.service;

import com.chinaunicom.eurekafeignclient.feignclient.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: WAI CHAN
 * @Date: 19-8-3 下午3:22
 */
@Service
public class HelloWorldService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHelloWorld(String name) {
        return eurekaClientFeign.sayHelloWorldFromClientEureka(name);
    }
}
