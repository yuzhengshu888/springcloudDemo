package com.yzs.payment.controller;

import com.yzs.common.dto.CommonResponse;
import com.yzs.payment.entity.Payment;
import com.yzs.payment.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PayMentService payMentService;

    @PostMapping("/create")
    public CommonResponse<Payment> create(@RequestBody Payment payment) {
        CommonResponse<Payment> commonResponse = new CommonResponse<Payment>();
        Assert.notNull(payment, "入参不能为空");
        Integer count = payMentService.create(payment.getId(), payment.getSerialId());
        if (count > 0) {
            commonResponse.set("200", "插入成功", null);
        } else {
            commonResponse.set("200", "插入失败", null);
        }
        return commonResponse;
    }

    @GetMapping("/get/{id}")
    public CommonResponse<Payment> create(@PathVariable("id") Long id) {
        CommonResponse<Payment> commonResponse = new CommonResponse<Payment>();
        Payment payment = payMentService.selectById(id);
        if (payment != null) {
            commonResponse.set("200", "查询到数据", payment);
        } else {
            commonResponse.set("404", "未查询到数据", null);
        }
        return commonResponse;
    }
}
