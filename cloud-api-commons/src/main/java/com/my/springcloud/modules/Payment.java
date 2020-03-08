package com.my.springcloud.modules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: cloud2020
 * @BelongsPackage: com.my.springcloud.modules
 * @Author: Jackson_J
 * @CreateTime: 2020-03-07 11:11
 * @Description: 支付类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = 1827411388368755355L;
    private Long id;
    private String serial;
}
