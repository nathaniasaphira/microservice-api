package com.microservice.auth.dto.base;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

public class ApiResponse<T> {

    private final ApiResult<T> result;
    private final HttpStatus status;
    private final HttpHeaders headers;

    public ApiResponse(ApiResult<T> result, HttpStatus status, HttpHeaders headers) {
        this.result = result;
        this.status = status;
        this.headers = headers;
    }
    
    public ApiResult<T> getResult() {
        return result;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }
    
}
