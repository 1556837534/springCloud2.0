package com.my.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.controller
 * @Author: Jackson_J
 * @CreateTime: 2020-03-08 10:38
 * @Description: ${Description}
 */
@RestController
// 支持Nacos 的动态刷新功能
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo () {
        return configInfo;
    }
}
