package com.wujinhua.springcloudalibaba.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/5 16:57
 */
@Data
public class Account {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;
}
