package springcloud.controller;

import com.my.springcloud.modules.Payment;
import com.my.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import springcloud.service.IPaymentService;

import javax.annotation.Resource;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.controller
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 14:08
 * @Description: 订单接口
 */
@RestController
@RequestMapping("/comsumer/payment")
@Slf4j
public class OrderController {

    @Value("${service-url.nacos-user-service}")
    private  String SERVICE_ADDRESS;

    @Resource
    private IPaymentService paymentService;

    // 这个模板类需要配置下
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return paymentService.getPaymentById(id);
    }

    @PostMapping("/create")
    public CommonResult<Payment> create(Payment payment) {

        return restTemplate.postForObject(SERVICE_ADDRESS+"/payment/add/",payment,CommonResult.class);

    }
}
