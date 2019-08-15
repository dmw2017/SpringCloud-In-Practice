package com.chinaunicom.eurekafeignclient.feignclient;

import com.chinaunicom.eurekafeignclient.component.HiHystrix;
import com.chinaunicom.eurekafeignclient.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: WAI CHAN
 * @Date: 19-8-3 下午2:30
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = HiHystrix.class)
public interface EurekaClientFeign {
    @GetMapping(value = "/helloWorld")
    String sayHelloWorldFromClientEureka(@RequestParam(value = "name") String name);
}
