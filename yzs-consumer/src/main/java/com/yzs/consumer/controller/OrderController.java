package com.yzs.consumer.controller;

import com.yzs.consumer.entity.ConsumerPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.yzs.common.dto.CommonResponse;

@RestController
@RequestMapping("/order")
public class OrderController {
    private static String payment_url = "http://localhost:8080";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/payment/create")
    public CommonResponse<ConsumerPayment> create(ConsumerPayment payment) {
        return restTemplate.postForObject(payment_url + "/payment/create", payment, CommonResponse.class);
    }

}
