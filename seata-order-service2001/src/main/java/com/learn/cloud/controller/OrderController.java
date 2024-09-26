package com.learn.cloud.controller;

import com.learn.cloud.entities.Order;
import com.learn.cloud.resp.ResultData;
import com.learn.cloud.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: OrderController
 * Package: com.learn.cloud.controller
 * Description:
 *
 * @Author zyh
 * @Create 2024/9/5 17:13
 * @Version 1.0
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public ResultData create(Order order)
    {
        orderService.create(order);
        return ResultData.success(order);
    }
}
