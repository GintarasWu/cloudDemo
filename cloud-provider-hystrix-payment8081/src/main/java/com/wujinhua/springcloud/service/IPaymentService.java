package com.wujinhua.springcloud.service;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/23 16:47
 */
public interface IPaymentService {
    /**
     * 正常响应OK
     *
     * @param id
     * @return
     */
    String paymentOK(Integer id);


    /**
     * 会超时报错的方法
     *
     * @param id
     * @return
     */
    String paymentTimeOut(Integer id);


    /**
     * 熔断降级
     *
     * @param id
     * @return
     */
    String paymentCircuitBreaker(Integer id);
}
