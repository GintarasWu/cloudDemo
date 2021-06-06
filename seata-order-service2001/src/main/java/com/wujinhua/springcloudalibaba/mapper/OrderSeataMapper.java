package com.wujinhua.springcloudalibaba.mapper;

import com.wujinhua.springcloudalibaba.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/5 16:01
 */
@Mapper
public interface OrderSeataMapper {
    /**
     * 新建订单
     *
     * @param order
     */
    void insert(Order order);

    /**
     * 订单完成付款以后, 需要修改订单状态 0 -> 1
     *
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
