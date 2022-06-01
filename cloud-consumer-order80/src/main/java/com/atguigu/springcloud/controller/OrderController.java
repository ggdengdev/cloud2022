package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {
    private static final String PAYMENT_URL = "http://127.0.0.1:8001";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/payment/save")
    public CommonResult<?> save(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/save", payment, CommonResult.class);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<?> getPayment(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/getPaymentById/" + id, CommonResult.class);
    }

}
