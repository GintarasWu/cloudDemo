package com.wujinhua.springcloudalibaba.service;

import com.wujinhua.springcloudalibaba.entity.Order;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/5 17:10
 */
public interface OrderService {
    /**
     * 创建一个订单
     *
     * @param order
     */
    void create(Order order);
}
