package com.vtxlab.project.crypto.coingecko.exception;


import com.vtxlab.project.crypto.coingecko.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler<T> {

    @ExceptionHandler({ApiException.class})
    public ResponseEntity<ApiResponse<T>> HandleApiException(){
        return ResponseEntity.badRequest().body(
                new ApiResponse<>(
                        401,
                        "Calling third-party API failed",
                        null)
        );
    }
}
