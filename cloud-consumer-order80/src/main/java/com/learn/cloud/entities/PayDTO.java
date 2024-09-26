package com.learn.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ClassName: PayDTO
 * Package: com.learn.cloud.entites
 * Description:
 * 一般而言，调用者获悉服务提供者提供的entity资源并知道表结构关系，
 * 所以服务提供方给出的接口文档都应该为DTO
 *
 * @Author zyh
 * @Create 2024/8/22 15:07
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayDTO implements Serializable {

    private Integer id;
    //支付流水号
    private String payNo;
    //订单流水号
    private String orderNo;
    //用户账号ID
    private Integer userId;
    //交易金额
    private BigDecimal amount;
}
