package com.learn.cloud.controller;

import com.learn.cloud.entities.PayDTO;
import com.learn.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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
//    public static final String PaymentSrv_URL = "http://localhost:8001"; // 先写死，硬编码
    public static final String PaymentSrv_URL = "http://cloud-payment-service"; // 服务中心上的微服务名称

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/pay/add")
    public ResultData addOrder(PayDTO payDTO) {
        return restTemplate.postForObject(PaymentSrv_URL + "/pay/add", payDTO, ResultData.class);
    }

    @GetMapping(value = "/consumer/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(PaymentSrv_URL + "/pay/get/" + id, ResultData.class, id);
    }

//    @DeleteMapping(value = "/consumer/pay/delete/{id}")
//    public ResultData deleteOrder(@PathVariable("id") Integer id) {
//        restTemplate.delete(PaymentSrv_URL + "/pay/del/" + id);
//        return ResultData.success("删除成功");
//    }
//
//    @PutMapping(value = "/consumer/pay/update")
//    public ResultData updateOrder(@RequestBody PayDTO payDTO) {
//        restTemplate.put(PaymentSrv_URL + "/pay/update/", payDTO);
//        return ResultData.success("更新成功");
//    }

    @GetMapping(value = "/consumer/pay/get/info")
    private String getInfoByConsul() {
        return restTemplate.getForObject(PaymentSrv_URL + "/pay/get/info", String.class);
    }

    @Resource
    private DiscoveryClient discoveryClient;
    @GetMapping("/consumer/discovery")
    public String discovery()
    {
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            System.out.println(element);
        }

        System.out.println("===================================");

        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for (ServiceInstance element : instances) {
            System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
        }

        return instances.get(0).getServiceId()+":"+instances.get(0).getPort();
    }

}
