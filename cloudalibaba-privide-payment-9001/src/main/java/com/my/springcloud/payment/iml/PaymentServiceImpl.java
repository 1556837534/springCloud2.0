package com.my.springcloud.payment.iml;

import com.my.springcloud.dao.PaymentDao;
import com.my.springcloud.modules.Payment;
import com.my.springcloud.payment.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.service.payment.iml
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 11:56
 * @Description: ${Description}
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
