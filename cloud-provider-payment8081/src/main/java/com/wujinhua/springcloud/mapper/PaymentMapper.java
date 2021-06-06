package com.wujinhua.springcloud.mapper;

import com.wujinhua.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/14 0:15
 */
@Mapper
public interface PaymentMapper {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
