package springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.config
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 14:13
 * @Description: ${Description}
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate () {
        return new RestTemplate();
    }
}
