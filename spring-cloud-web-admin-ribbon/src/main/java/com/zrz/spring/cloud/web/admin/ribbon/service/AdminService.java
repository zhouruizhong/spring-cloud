package com.zrz.spring.cloud.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 周瑞忠
 * @date 2018/12/30 15:25
 */

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String message){
        return restTemplate.getForObject("http://spring-cloud-service-admin/hi?meesage="+ message, String.class);
    }
}
