package com.centerm.spring.cloud.ribbon.controller;

import com.centerm.spring.cloud.ribbon.service.IRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private IRibbonService ribbonService;

    @GetMapping("/hello")
    public String helloRibbon(String message) {
        return ribbonService.helloRibbon("ribbon "+message);
    }
}
