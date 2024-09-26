package com.learn.cloud.controller;

import com.learn.cloud.entities.Pay;
import com.learn.cloud.entities.PayDTO;
import com.learn.cloud.resp.ResultData;
import com.learn.cloud.service.PayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.Pipe;
import java.util.List;

/**
 * ClassName: PayController
 * Package: com.learn.cloud.controller
 * Description:
 *
 * @Author zyh
 * @Create 2024/8/22 15:17
 * @Version 1.0
 */
// RestController包含 @Controller 和 @ResponseBody
@RestController
@Slf4j
@RequestMapping(value = "/pay")
@Tag(name = "支付微服务模块",description = "支付CRUD")
public class PayController {

    @Resource
    private PayService payService;

    @PostMapping(value = "/add")
    @Operation(summary = "新增",description = "新增支付流水方法,json串做参数")
    public ResultData<String> addPay(@RequestBody Pay pay) {
        System.out.println(pay.toString());
        int i = payService.add(pay);
        return ResultData.success("成功插入记录，返回值" + i);
    }

    @DeleteMapping(value = "/del/{id}")
    @Operation(summary = "删除",description = "删除支付流水方法")
    public ResultData<Integer> deletePay(@PathVariable("id") Integer id) {
        int i = payService.delete(id);
        return ResultData.success(i);
    }


    @PutMapping(value = "/update")
    @Operation(summary = "修改",description = "修改支付流水方法")
    public ResultData<String> updatePay(@RequestBody PayDTO payDTO) {
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDTO, pay);
        int i = payService.update(pay);
        return ResultData.success("成功修改记录，返回值" + i);
    }


    @GetMapping(value = "/get/{id}")
    @Operation(summary = "按照ID查流水",description = "查询支付流水方法")
    public ResultData<Pay> getById(@PathVariable("id") Integer id) {
        if (id == -1) {
            throw new RuntimeException("查询id不能为负数");
        }
        Pay pay = payService.getById(id);
        return ResultData.success(pay);
    }


    @GetMapping(value = "/getAll")
    @Operation(summary = "查询全部",description = "查询全部数据")
    public List<Pay> getAll() {
        return payService.getAll();
    }

    @Value("${server.port}")
    private String port;
    @GetMapping(value = "/get/info")
    public String getInfoByConsul(@Value("${learn.info}") String learnInfo) {
        return "leranInfo: " + learnInfo + "\t" + "port: " + port;
    }
}
