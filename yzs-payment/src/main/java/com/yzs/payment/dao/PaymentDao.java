package com.yzs.payment.dao;

import com.yzs.payment.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    Payment selectById(@Param("id") Long id);

    Integer insert(@Param("id") Long id, @Param("serialId") String serialId);
}
