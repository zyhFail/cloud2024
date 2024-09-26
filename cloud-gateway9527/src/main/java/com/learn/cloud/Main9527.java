package com.learn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: Main9527
 * Package: com.learn.cloud
 * Description:
 *
 * @Author zyh
 * @Create 2024/8/31 15:15
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient //服务注册与发现
public class Main9527 {
    public static void main(String[] args) {
        SpringApplication.run(Main9527.class, args);
    }
}
