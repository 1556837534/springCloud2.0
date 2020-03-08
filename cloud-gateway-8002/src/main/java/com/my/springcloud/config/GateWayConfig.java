package com.my.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.config
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 21:49
 * @Description: ${Description}
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customeRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        // 将 /guonei 的路径 映射为 百度地址
        return routeLocatorBuilder.routes().
                route("rout1",r -> r.path("/guonei").uri("http://www.baidu.com")).build();
    }
}
