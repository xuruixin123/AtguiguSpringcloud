package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 全参构造方法
@NoArgsConstructor // 空参构造方法
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T      data;

    public CommonResult(Integer code, String message){

        this(code, message, null);
    }

}
