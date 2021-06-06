package com.wujinhua.springcloud.ribbon;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 自定义轮训算法
 *
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/23 14:00
 */
public interface LoadBalancer {
    /**
     * 通过算法 在多个实例中选择一个
     *
     * @param serviceInstanceList 多个实例
     * @return 满足算法后的实例
     */
    ServiceInstance getInstances(List<ServiceInstance> serviceInstanceList);
}
