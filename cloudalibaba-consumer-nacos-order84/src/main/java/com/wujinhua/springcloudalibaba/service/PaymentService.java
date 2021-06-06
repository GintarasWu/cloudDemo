package com.wujinhua.springcloudalibaba.service;

import com.wujinhua.springcloud.entity.CommonResult;
import com.wujinhua.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/4 22:09
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping("/payment/{id}")
    CommonResult<Payment> payment(@PathVariable("id") Long id);
}
