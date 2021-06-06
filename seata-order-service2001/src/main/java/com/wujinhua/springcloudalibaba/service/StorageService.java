package com.wujinhua.springcloudalibaba.service;

import com.wujinhua.springcloudalibaba.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/5 17:14
 */
@FeignClient("seata-storage-service")
public interface StorageService {
    @PostMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
