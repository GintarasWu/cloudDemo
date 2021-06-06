package com.wujinhua.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wujinhua.springcloud.service.PaymentHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/23 20:17
 */
@RestController
@DefaultProperties(defaultFallback = "handleError")
public class OrderHystrixController {
    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentOK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentException", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentTimeOut(id);
    }

    @HystrixCommand
    @GetMapping("/consumer/payment/global/hystrix/timeout/{id}")
    public String paymentTimeOut(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentTimeOut(id);
    }

    public String paymentException(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " 系统繁忙或出错,请稍后再试, id：" + id + "\t" + "o(╥﹏╥)o";
    }

    public String handleError() {
        return "系统繁忙请稍后再试";
    }
}
