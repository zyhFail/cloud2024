package com.learn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName: Main802
 * Package: com.learn.cloud
 * Description:
 *
 * @Author zyh
 * @Create 2024/8/27 19:08
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.learn.cloud.mapper")
@RefreshScope
public class Main802 {
    public static void main(String[] args) {
        SpringApplication.run(Main802.class, args);
    }
}
