package com.vtxlab.project.crypto.polygon.exception;

import com.vtxlab.project.crypto.polygon.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler<T> {

    @ExceptionHandler({ApiException.class})
    public ResponseEntity<ApiResponse<T>> HandlerApiException(){
        return ResponseEntity.ok().body(new ApiResponse<>(401,"Calling Third-party API failed."));
    }
}
