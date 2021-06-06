package com.wujinhua.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/18 21:50
 */
@Configuration
public class SpringApplicationConfig {
    @Bean
//    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
