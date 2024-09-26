package com.learn.cloud.apis;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.learn.cloud.entities.PayDTO;
import com.learn.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * ClassName: PayFeignSentinelApi
 * Package: com.learn.cloud.apis
 * Description:
 *
 * @Author zyh
 * @Create 2024/9/4 16:50
 * @Version 1.0
 */
@FeignClient(value = "nacos-payment-provider", fallback = PayFeignSentinelApiFallBack.class)
public interface PayFeignSentinelApi {

    @GetMapping("/pay/nacos/get/{orderNo}")
    public ResultData getPayByOrderNo(@PathVariable("orderNo") String orderNo);
}
