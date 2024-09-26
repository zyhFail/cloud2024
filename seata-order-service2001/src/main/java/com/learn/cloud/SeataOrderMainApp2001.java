package com.learn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName: SeataOrderMainApp2001
 * Package: com.learn.cloud
 * Description:
 *
 * @Author zyh
 * @Create 2024/9/5 16:55
 * @Version 1.0
 */

@SpringBootApplication
@MapperScan("com.learn.cloud.mapper") //import tk.mybatis.spring.annotation.MapperScan;
@EnableDiscoveryClient //服务注册和发现
@EnableFeignClients
public class SeataOrderMainApp2001
{
    public static void main(String[] args)
    {
        SpringApplication.run(SeataOrderMainApp2001.class,args);
    }
}
