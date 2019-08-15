package com.chinaunicom.erc.controller;

import com.chinaunicom.erc.service.RibbonService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WAI CHAN
 * @Date: 19-8-3 下午12:50
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/helloWorld")
    public String helloWorld(@RequestParam(required = false, defaultValue = "forezp") String name) {
        return ribbonService.helloWorld(name);
    }

    @GetMapping("/testRibbon")
    public String testRibbon() {
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        return instance.getHost() + ":" + instance.getPort();
    }
}
