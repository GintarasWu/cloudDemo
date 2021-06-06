package com.wujinhua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 *
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/12 23:13
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8082 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8082.class, args);
    }
}
