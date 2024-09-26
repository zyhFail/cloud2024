package com.learn.cloud.service.impl;

import com.learn.cloud.entities.Pay;
import com.learn.cloud.mapper.PayMapper;
import com.learn.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: PayServiceImpl
 * Package: com.learn.cloud.service.impl
 * Description:
 *
 * @Author zyh
 * @Create 2024/8/22 15:11
 * @Version 1.0
 */
@Service
public class PayServiceImpl implements PayService {

    @Resource
    private PayMapper payMapper;

    @Override
    public int add(Pay pay) {
        return payMapper.insertSelective(pay);
    }

    @Override
    public int delete(Integer id) {
        return payMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Pay pay) {
        return payMapper.updateByPrimaryKeySelective(pay);
    }

    @Override
    public Pay getById(Integer id) {
        return payMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Pay> getAll() {
        return payMapper.selectAll();
    }
}
