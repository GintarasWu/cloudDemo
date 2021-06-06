package com.wujinhua.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 日志打印配置
 * NOEE：默认，不显示日志
 * BASIC：仅记录请求方法、URL、响应状态码以及执行时间
 * HEADERS：除了 BASIC 中定义的信息之外，还有请求和响应的头信息
 * FULL：除了 HEADERS 中定义的信息外，还有请求和响应的正文以及元数据
 *
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/5/23 16:01
 */
@Configuration
public class LogConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;//日志级别
    }
}
