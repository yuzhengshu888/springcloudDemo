package com.yzs.payment.service;

import com.yzs.payment.entity.Payment;

public interface PayMentService {
    Integer create(Long id, String serialId);

    Payment selectById(Long id);
}
