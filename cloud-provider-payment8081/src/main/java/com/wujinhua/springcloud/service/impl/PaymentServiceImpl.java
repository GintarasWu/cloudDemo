package com.wujinhua.springcloud.service.impl;

import com.wujinhua.springcloud.entity.Payment;
import com.wujinhua.springcloud.mapper.PaymentMapper;
import com.wujinhua.springcloud.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/14 0:22
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
