package com.my.springcloud.controller;

import com.my.springcloud.modules.Payment;
import com.my.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.controller
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 14:08
 * @Description: 订单接口
 */
@RestController
@RequestMapping("/comsumer/payment")
@Slf4j
public class OrderController {

    private static final String SERVICE_ADDRESS = "http://127.0.0.1:8001";

    // 这个模板类需要配置下
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(SERVICE_ADDRESS+"/payment/get/"+id,CommonResult.class);
    }

    @PostMapping("/create")
    public CommonResult<Payment> create(Payment payment) {

        return restTemplate.postForObject(SERVICE_ADDRESS+"/payment/add/",payment,CommonResult.class);

    }
}
