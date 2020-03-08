package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 14:04
 * @Description: ${Description}
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderConsumer83 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumer83.class,args);
    }
}
