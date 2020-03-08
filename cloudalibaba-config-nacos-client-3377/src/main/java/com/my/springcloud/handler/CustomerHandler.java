package com.my.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.my.springcloud.vo.CommonResult;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.handler
 * @Author: Jackson_J
 * @CreateTime: 2020-03-08 15:57
 * @Description: Sentinel 统一兜底方法
 */
public class CustomerHandler {
    public static CommonResult handlerException(BlockException block) {
        return new CommonResult(44,"统一兜底方法1");
    }
    public static CommonResult handlerException2(BlockException block) {
        return new CommonResult(44,"统一兜底方法2");
    }
}
