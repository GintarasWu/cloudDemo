package com.wujinhua.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/23 22:23
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentOK(Integer id) {
        return "----PaymentFallbackService fall back-paymentOK...o(╥﹏╥)o";
    }

    @Override
    public String paymentTimeOut(Integer id) {
        return "----PaymentFallbackService fall back-paymentTimeOut...o(╥﹏╥)o";
    }
}
