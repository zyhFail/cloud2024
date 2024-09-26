package com.learn.cloud.service;

import com.learn.cloud.entities.Order;

/**
 * ClassName: OrderService
 * Package: com.learn.cloud.service
 * Description:
 *
 * @Author zyh
 * @Create 2024/9/5 16:59
 * @Version 1.0
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
