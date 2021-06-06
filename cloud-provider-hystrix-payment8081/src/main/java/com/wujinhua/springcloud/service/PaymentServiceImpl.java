package com.wujinhua.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/23 16:48
 */
@Service
public class PaymentServiceImpl implements IPaymentService {
    @Override
    public String paymentOK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " SUCCESS_OK,id：" + id + "\t" + "O(∩_∩)O哈哈~";
    }

    @Override
//    @HystrixCommand(fallbackMethod = "paymentException", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//    })
    public String paymentTimeOut(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        int age = 1/ 0;
        return "线程池：" + Thread.currentThread().getName() + " SUCCESS_TIMEOUT,id：" + id + "\t" + "ε＝ε＝ε＝(#>д<)ﾉ";
    }
//
//    public String paymentException(Integer id) {
//        return "线程池：" + Thread.currentThread().getName() + " 系统繁忙或出错,请稍后再试, id：" + id + "\t" + "o(╥﹏╥)o";
//    }


    /**
     * 熔断降级
     *
     * @param id
     * @return
     */
    @Override
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//是否启用断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")//失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id) {
        if (id < 0)
            throw new RuntimeException("****id 不能为负数");
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功，流水号：" + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(Integer id) {
        return "id：" + id + "，不能为负数，请稍后再试，。。。";
    }
}
