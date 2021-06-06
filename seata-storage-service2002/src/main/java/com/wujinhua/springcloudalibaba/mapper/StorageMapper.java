package com.wujinhua.springcloudalibaba.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/5 16:28
 */
@Mapper
public interface StorageMapper {
    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}