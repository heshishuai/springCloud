package service.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api("hello service api")
public class HelloController {

    @Value("${server.port}")
    private String port;

/*    @ApiOperation("hello message")*/
   /* @ApiImplicitParam(name = "message",paramType = "query")*/
    @GetMapping("/hello")
    public String hello(String message){
        return String.format("hello message is :%s,port:%s",message,port) ;
    }



}
