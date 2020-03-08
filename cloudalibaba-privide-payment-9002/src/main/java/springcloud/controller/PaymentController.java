package springcloud.controller;

import com.my.springcloud.modules.Payment;
import com.my.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import springcloud.payment.IPaymentService;

import javax.annotation.Resource;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.controller
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 11:59
 * @Description: ${Description}
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Resource
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * RequestBody 不写会导致参数注入失败
     * @param payment
     * @return
     */
    @PostMapping("/add")
    public CommonResult add(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        log.info("----插入结果:" +i);
        if (i > 0) {
            return new CommonResult(200,"成功:"+serverPort,i);
        } else {
            return new CommonResult(401,"失败");
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("----查询结果 :" +payment);
        if (payment != null) {
            return new CommonResult(200,"成功"+serverPort,payment);
        } else {
            return new CommonResult(401,"失败,查询ID:"+id);
        }
    }
}
