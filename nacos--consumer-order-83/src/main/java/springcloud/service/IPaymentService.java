package springcloud.service;

import com.my.springcloud.modules.Payment;
import com.my.springcloud.vo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: springcloud.service
 * @Author: Jackson_J
 * @CreateTime: 2020-03-08 16:48
 * @Description: Fengin 的接口编程
 */
@FeignClient(value="cloudalibaba-payment-service",fallback = PaymentFallbackService.class)
public interface IPaymentService {

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
