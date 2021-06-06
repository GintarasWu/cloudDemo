package com.wujinhua.springcloud.service;

import com.wujinhua.springcloud.entity.CommonResult;
import com.wujinhua.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/23 15:25
 */
@FeignClient("CLOUD-PAYMENT-SERVICE")
@Service
public interface PaymentService {
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPayment(@PathVariable("id") Long id);

    /**
     * 模拟调用feign超时
     *
     * @return port
     */
    @GetMapping("/payment/feign/timeout")
    String timeout();
}
