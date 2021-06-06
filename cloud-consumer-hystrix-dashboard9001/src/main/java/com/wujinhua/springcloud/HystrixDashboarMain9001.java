package com.wujinhua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/23 23:12
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboarMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboarMain9001.class, args);
    }
}
