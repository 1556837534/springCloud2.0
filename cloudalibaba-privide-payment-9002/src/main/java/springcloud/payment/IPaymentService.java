package springcloud.payment;

import com.my.springcloud.modules.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.service
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 11:55
 * @Description: ${Description}
 */

public interface IPaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
