package com.chinaunicom.eurekafeignclient.component;

import com.chinaunicom.eurekafeignclient.feignclient.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @Author: WAI CHAN
 * @Date: 19-8-3 下午6:12
 */
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHelloWorldFromClientEureka(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
