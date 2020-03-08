package com.my.springcloud.dao;

import com.my.springcloud.modules.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.dao
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 11:20
 * @Description: ${Description}
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
