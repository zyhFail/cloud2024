package com.learn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName: SeataAccountMainApp2003
 * Package: com.learn.cloud
 * Description:
 *
 * @Author zyh
 * @Create 2024/9/5 17:29
 * @Version 1.0
 */
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.learn.cloud.mapper") //import tk.mybatis.spring.annotation.MapperScan;
@SpringBootApplication
public class SeataAccountMainApp2003
{
    public static void main(String[] args)
    {
        SpringApplication.run(SeataAccountMainApp2003.class,args);
    }
}