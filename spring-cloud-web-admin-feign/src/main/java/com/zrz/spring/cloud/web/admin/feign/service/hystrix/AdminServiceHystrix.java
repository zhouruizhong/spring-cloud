package com.zrz.spring.cloud.web.admin.feign.service.hystrix;

import com.zrz.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author 周瑞忠
 * @date 2018/12/31 0:48
 */
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }

}
