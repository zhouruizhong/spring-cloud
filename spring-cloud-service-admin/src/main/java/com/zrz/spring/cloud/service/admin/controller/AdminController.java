package com.zrz.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周瑞忠
 * @description java类作用描述
 * @date 2018/12/30 14:40
 */

@RestController
public class AdminController {

    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String message){
        return String.format("Hi，your message is : %s i am from port : %s", message, port);
    }

}
