package com.wujinhua.springcloud.ribbon;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/23 14:02
 */
@Component
public class LoadBalancerImpl implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public ServiceInstance getInstances(List<ServiceInstance> serviceInstanceList) {
        int index = getAndIncrement() % serviceInstanceList.size();
        return serviceInstanceList.get(index);
    }

    /**
     * 自定义轮训算法
     *
     * @return 返回满足算法的实例
     */
    private int getAndIncrement() {
        int current;
        int next;
        for (; ; ) {
            current = atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
            if (atomicInteger.compareAndSet(current, next)) {
                System.out.println("****next: " + next);
                return next;
            }
        }
    }
}
