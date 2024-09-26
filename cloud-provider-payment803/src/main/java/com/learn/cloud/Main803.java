package com.learn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName: Main803
 * Package: com.learn.cloud
 * Description:
 *
 * @Author zyh
 * @Create 2024/8/27 19:37
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.learn.cloud.mapper")
@RefreshScope
public class Main803 {
    public static void main(String[] args) {
        SpringApplication.run(Main803.class, args);
    }
}
