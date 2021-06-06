package com.wujinhua.springcloudalibaba.service.impl;

import com.wujinhua.springcloudalibaba.entity.Order;
import com.wujinhua.springcloudalibaba.mapper.OrderSeataMapper;
import com.wujinhua.springcloudalibaba.service.AccountService;
import com.wujinhua.springcloudalibaba.service.OrderService;
import com.wujinhua.springcloudalibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/6 0:27
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderSeataMapper orderSeataMapper;

    @Autowired
    private StorageService storageService;

    @Autowired
    private AccountService accountService;


    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说：下订单->扣库存->减余额->改状态
     *
     * @param order
     */
    @Override
    @GlobalTransactional(name = "seata-order-create", rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------------------began-------------------");
        orderSeataMapper.insert(order);
        storageService.decrease(order.getProductId(), order.getCount());
        accountService.decrease(order.getUserId(), order.getMoney());
        orderSeataMapper.update(order.getUserId(), 0);
        log.info("-------------------end--------------------");
        log.info("O(∩_∩)O哈哈~");
    }
}
