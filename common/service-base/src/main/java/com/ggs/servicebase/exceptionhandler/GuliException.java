package com.ggs.servicebase.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  @Author Starbug
 *  @Date 2020/11/16 22:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuliException extends RuntimeException {

    private Integer code; //状态码
    private String msg; //错误信息


}
