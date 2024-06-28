package com.microservice.auth.dto.base;

public abstract class ApiResult<T> {

    private String message;
    private T data;

    public ApiResult(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public ApiResult(String message){
        this(message, null);
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
