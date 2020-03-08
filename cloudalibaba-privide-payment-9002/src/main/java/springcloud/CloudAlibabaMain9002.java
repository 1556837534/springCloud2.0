package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud
 * @Author: Jackson_J
 * @CreateTime: 2020-03-08 09:04
 * @Description: ${Description}
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaMain9002.class,args);
    }
}
