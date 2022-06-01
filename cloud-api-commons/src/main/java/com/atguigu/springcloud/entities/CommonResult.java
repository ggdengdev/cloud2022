package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static CommonResult<?> Ok(String msg, Object payment) {
        CommonResult<Object> commonResult = new CommonResult<>();
        commonResult.setCode(200);
        commonResult.setMessage(msg);
        commonResult.setData(payment);
        return commonResult;
    }

    public static CommonResult<?> Ok(String msg) {
        CommonResult<Object> commonResult = new CommonResult<>();
        commonResult.setCode(200);
        commonResult.setMessage(msg);
        return commonResult;
    }

    public static CommonResult<?> error(String msg) {
        CommonResult<Object> commonResult = new CommonResult<>();
        commonResult.setCode(500);
        commonResult.setMessage(msg);
        return commonResult;
    }

    public static CommonResult<?> error(String msg, Object result) {
        CommonResult<Object> commonResult = new CommonResult<>();
        commonResult.setCode(500);
        commonResult.setMessage(msg);
        commonResult.setData(result);
        return commonResult;
    }
}
