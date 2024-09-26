package com.learn.cloud.service.impl;

import com.learn.cloud.mapper.StorageMapper;
import com.learn.cloud.service.StorageService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * ClassName: StorageServiceImpl
 * Package: com.learn.cloud.service.impl
 * Description:
 *
 * @Author zyh
 * @Create 2024/9/5 17:23
 * @Version 1.0
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageMapper storageMapper;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageMapper.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");
    }
}
