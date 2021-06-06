package com.wujinhua.springcloudalibaba.service;

import java.math.BigDecimal;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/5 17:01
 */
public interface AccountService {
    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money  金额
     */
    void decrease(Long userId, BigDecimal money);
}
