package com.wujinhua.springcloudalibaba.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/5 17:00
 */
@Mapper
public interface AccountMapper {
    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
