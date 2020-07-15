package com.centerm.spring.cloud.feign.service.impl;

import com.centerm.spring.cloud.feign.service.IFeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignFallback implements IFeignService{

    @Override
    public String helloFeign(String message) {
        return "hello-service is error";
    }
}
