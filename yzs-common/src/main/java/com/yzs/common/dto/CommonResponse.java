package com.yzs.common.dto;

import java.io.Serializable;

public class CommonResponse<T> implements Serializable {
    String code;
    String msg;
    T data;

    public CommonResponse() {

    }

    public CommonResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;

    }

    public CommonResponse<T> set(String code, String msg, T data) {
        return new CommonResponse<T>(code, msg, data);
    }
}
