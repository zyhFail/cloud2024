package com.learn.cloud.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: FeignConfig
 * Package: com.learn.cloud.config
 * Description:
 *
 * @Author zyh
 * @Create 2024/8/28 17:28
 * @Version 1.0
 */
@Configuration
public class FeignConfig {
    @Bean
    public Retryer retryer() {
//        return Retryer.NEVER_RETRY; // Feign默认配置是不走重试机制策略的
        // 最大请求次数为3次(1+2) 初始间隔时间为100ms  重试最大间隔时间为1s
        return new Retryer.Default(100, 1, 3);
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
