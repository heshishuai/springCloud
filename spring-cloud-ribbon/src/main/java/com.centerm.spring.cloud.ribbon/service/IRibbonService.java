package com.centerm.spring.cloud.ribbon.service;

public interface IRibbonService {
    String helloRibbon(String message);

    String helloRibbonFallBack(String message);

}
