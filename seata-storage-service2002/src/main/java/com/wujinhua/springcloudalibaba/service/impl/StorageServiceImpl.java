package com.wujinhua.springcloudalibaba.service.impl;


import com.wujinhua.springcloudalibaba.mapper.StorageMapper;
import com.wujinhua.springcloudalibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/5 16:43
 */
@Service
public class StorageServiceImpl implements StorageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageMapper.decrease(productId, count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}
