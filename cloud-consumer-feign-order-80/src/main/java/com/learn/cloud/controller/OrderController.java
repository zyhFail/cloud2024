package com.learn.cloud.controller;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.learn.cloud.apis.PayFeignApi;
import com.learn.cloud.entities.PayDTO;
import com.learn.cloud.resp.ResultData;
import com.learn.cloud.resp.ReturnCodeEnum;
import jakarta.annotation.Resource;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.xml.transform.Source;
import java.util.List;

/**
 * ClassName: OrderController
 * Package: com.learn.cloud.controller
 * Description:
 *
 * @Author zyh
 * @Create 2024/8/26 15:21
 * @Version 1.0
 */
@RestController
public class OrderController {

    @Resource
    private PayFeignApi payFeignApi;

    @PostMapping(value = "/feign/pay/add")
    public ResultData addOrder(@RequestBody PayDTO payDTO) {
        ResultData resultData = payFeignApi.addPay(payDTO);
        return resultData;
    }

    @GetMapping(value = "/feign/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id) {
        ResultData payInfo = null;

        try {
            System.out.println("调用开始--------:" + DateUtil.now());
            payInfo = payFeignApi.getPayInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("调用结束--------:" + DateUtil.now());
            ResultData.fail(ReturnCodeEnum.RC500.getCode(), e.getMessage());
        }

        return payInfo;
    }

    @GetMapping(value = "/feign/pay/get/info")
    public String mylb() {
        return payFeignApi.mylb();
    }



}
