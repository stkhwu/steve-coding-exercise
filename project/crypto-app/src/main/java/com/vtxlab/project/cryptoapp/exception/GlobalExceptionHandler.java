package com.vtxlab.project.cryptoapp.exception;


import com.vtxlab.project.cryptoapp.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler<T> {

    @ExceptionHandler({ApiException.class})
    public ResponseEntity<ApiResponse<T>> HandleApiException(){
        return ResponseEntity.badRequest().body(
                new ApiResponse<>(
                        401,
                        "Calling third-party API failed",
                        null));
    }
}
