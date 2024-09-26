package com.learn.cloud.apis;

import com.learn.cloud.resp.ResultData;
import com.learn.cloud.resp.ReturnCodeEnum;
import org.springframework.stereotype.Component;

/**
 * ClassName: PayFeignSentinelApiFallBack
 * Package: com.learn.cloud.apis
 * Description:
 *
 * @Author zyh
 * @Create 2024/9/4 16:52
 * @Version 1.0
 */
@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi{
    @Override
    public ResultData getPayByOrderNo(String orderNo) {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),"对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}
