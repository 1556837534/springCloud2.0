package com.my.springcloud.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.vo
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 11:15
 * @Description: 通用结果返回
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {
    private static final long serialVersionUID = -1512533355744845967L;

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message) {
       this(code,message,null);
    }

}
