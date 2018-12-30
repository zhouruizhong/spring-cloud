package com.zrz.spring.cloud.web.admin.feign.service;

import com.zrz.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 周瑞忠
 * @description java类作用描述
 * @date 2018/12/30 23:48
 */

@FeignClient(value = "spring-cloud-service-admin", fallback = AdminServiceHystrix.class )
public interface AdminService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "message") String message);
}
