package com.wujinhua.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wujinhua.springcloud.entity.CommonResult;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/3 21:22
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2");
    }
}
