package com.byit.fraud.dto;

import java.io.Serializable;

/**
 * Created by xiaobingbing on 2018/01/25.
 */
public class ResponseBase<T> implements Serializable {
    private String code;
    private String message;
    private T body;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
