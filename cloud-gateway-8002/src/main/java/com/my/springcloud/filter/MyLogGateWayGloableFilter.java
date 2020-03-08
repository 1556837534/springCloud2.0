package com.my.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.filter
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 22:37
 * @Description: ${Description}
 */
@Component
@Slf4j
public class MyLogGateWayGloableFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("com in global Filter:"+new Date());
        String userName = exchange.getRequest().getQueryParams().getFirst("userName");
        if (StringUtils.isEmpty(userName)) {
            log.info("---非法用户");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        // 放行
        return chain.filter(exchange);
    }

    //加载过滤器顺序 数据越小越先加载
    @Override
    public int getOrder() {
        return 0;
    }
}
