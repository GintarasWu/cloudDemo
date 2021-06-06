package com.wujinhua.springcloudalibaba.entity;

import lombok.Data;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/5 16:27
 */
@Data
public class Storage {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
