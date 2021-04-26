package com.yzs.payment.service.impl;

import com.yzs.payment.dao.PaymentDao;
import com.yzs.payment.entity.Payment;
import com.yzs.payment.service.PayMentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PayMentServiceImpl implements PayMentService {
    @Resource
    private PaymentDao paymentDao;

    public Integer create(Long id, String serialId) {
        return paymentDao.insert(id, serialId);
    }

    public Payment selectById(Long id) {
        return paymentDao.selectById(id);
    }
}
