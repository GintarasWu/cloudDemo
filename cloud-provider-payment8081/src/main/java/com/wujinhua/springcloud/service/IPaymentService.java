package com.wujinhua.springcloud.service;

import com.wujinhua.springcloud.entity.Payment;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/14 0:21
 */
public interface IPaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
