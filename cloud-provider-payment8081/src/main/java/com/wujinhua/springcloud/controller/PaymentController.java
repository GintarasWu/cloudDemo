package com.wujinhua.springcloud.controller;

import com.wujinhua.springcloud.entity.CommonResult;
import com.wujinhua.springcloud.entity.Payment;
import com.wujinhua.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/14 0:24
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("create result ：{}", result);
        if (result > 0) {
            return new CommonResult<>(200, "success, port is: " + port, result);
        } else {
            return new CommonResult<>(444, "fail", "create fail");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("query result：{}", payment);
        if (payment != null) {
            return new CommonResult<>(200, "success, port is: " + port, payment);
        } else {
            return new CommonResult<>(444, "fail", "no data found");
        }
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB() {
        return port;
    }

    @GetMapping("/payment/feign/timeout")
    public String timeout() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }
}
