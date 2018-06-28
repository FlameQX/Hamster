package com.hamster.ak.common.bean;

import lombok.Data;

/**
 * @author yanwenbo
 */
@Data
public class ResultBean<T> {

    private Integer code;
    private String message;
    private T data;

    private static final Integer SUCCESS = 0;
    private static final Integer FAIL = 1;
    public static final String DEFAULT_ERROR_MSG = "error";
    public static final String SUCCESS_MSG = "success";

    public static ResultBean systemError() {
        ResultBean result = new ResultBean();
        result.setCode(FAIL);
        result.setMessage("系统错误");
        return result;
    }

    public static ResultBean fail(String msg) {
        ResultBean result = new ResultBean();
        result.setCode(FAIL);
        result.setMessage(msg);
        return result;
    }
}