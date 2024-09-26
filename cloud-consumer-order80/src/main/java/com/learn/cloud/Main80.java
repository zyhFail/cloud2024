package com.learn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: Main80
 * Package: com.learn.cloud
 * Description:
 *
 * @Author zyh
 * @Create 2024/8/26 15:06
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Main80 {
    public static void main(String[] args) {
        SpringApplication.run(Main80.class, args);
    }
}
