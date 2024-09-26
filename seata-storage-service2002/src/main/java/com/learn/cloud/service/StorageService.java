package com.learn.cloud.service;

/**
 * ClassName: StorageService
 * Package: com.learn.cloud.service
 * Description:
 *
 * @Author zyh
 * @Create 2024/9/5 17:23
 * @Version 1.0
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
