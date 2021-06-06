package com.wujinhua.springcloudalibaba.service;

import com.wujinhua.springcloud.entity.CommonResult;
import com.wujinhua.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/4 22:11
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> payment(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
