package com.learn.cloud.service;

import com.learn.cloud.entities.Pay;

import java.util.List;

/**
 * ClassName: PayService
 * Package: com.learn.cloud.service
 * Description:
 *
 * @Author zyh
 * @Create 2024/8/22 15:09
 * @Version 1.0
 */
public interface PayService {

    public int add(Pay pay);

    public int delete(Integer id);

    public int update(Pay pay);

    public Pay getById(Integer id);

    public List<Pay> getAll();
}
