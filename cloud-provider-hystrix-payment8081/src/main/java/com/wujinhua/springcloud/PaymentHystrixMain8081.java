package com.wujinhua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/23 16:52
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentHystrixMain8081 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8081.class, args);
    }
}
