package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private IPaymentService paymentService;

    @PostMapping("/save")
    public CommonResult<?> save(@RequestBody Payment payment) {
        int result = paymentService.save(payment);
        log.info("插入结果：" + result);
        return 1 == result ? CommonResult.Ok("插入成功", result) : CommonResult.error("插入失败" , result);
    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult<?> getPaymentById(@PathVariable("id") long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果：" + payment);
        return null != payment ? CommonResult.Ok("查询成功", payment) : CommonResult.error("查询失败");
    }
}
