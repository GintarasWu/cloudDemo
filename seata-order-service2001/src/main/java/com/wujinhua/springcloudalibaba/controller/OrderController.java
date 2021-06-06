package com.wujinhua.springcloudalibaba.controller;

import com.wujinhua.springcloudalibaba.entity.CommonResult;
import com.wujinhua.springcloudalibaba.entity.Order;
import com.wujinhua.springcloudalibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/6 0:33
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
