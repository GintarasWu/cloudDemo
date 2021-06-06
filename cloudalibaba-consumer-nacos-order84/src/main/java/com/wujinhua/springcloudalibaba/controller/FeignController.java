package com.wujinhua.springcloudalibaba.controller;

import com.wujinhua.springcloud.entity.CommonResult;
import com.wujinhua.springcloud.entity.Payment;
import com.wujinhua.springcloudalibaba.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/4 22:12
 */
@RestController
public class FeignController {
    @Autowired
    private PaymentService service;

    @GetMapping("/consumer/payment/{id}")
    public CommonResult<Payment> payment(@PathVariable("id") Long id) {
        return service.payment(id);
    }
}
