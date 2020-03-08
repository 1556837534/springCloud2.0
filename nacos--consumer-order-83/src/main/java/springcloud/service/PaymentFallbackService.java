package springcloud.service;

import com.my.springcloud.modules.Payment;
import com.my.springcloud.vo.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: springcloud.service
 * @Author: Jackson_J
 * @CreateTime: 2020-03-08 16:54
 * @Description: ${Description}
 */
@Component
public class PaymentFallbackService implements IPaymentService{
    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        return new CommonResult<>(44,"兜底方法");
    }
}
