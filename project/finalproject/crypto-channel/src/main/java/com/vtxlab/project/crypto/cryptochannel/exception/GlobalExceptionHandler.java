package com.vtxlab.project.crypto.cryptochannel.exception;

import com.vtxlab.project.crypto.cryptochannel.response.ApiResponse;
import com.vtxlab.project.crypto.cryptochannel.response.ResponseData;
import com.vtxlab.project.crypto.cryptochannel.response.enums.ResponseStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ApiException.class})
    public ResponseEntity<ApiResponse<? extends ResponseData>> handleApiException(ApiException e) {
        // ChannelApi.setAlerts.add(new Alert(e.getCode(), e.getMessage()));

        return ResponseEntity.badRequest().body(new ApiResponse<>( //
                ResponseStatus.INTERNAL_API_FAIL.getCode(), //
                ResponseStatus.INTERNAL_API_FAIL.getMessage(), //
                new ResponseData(), //
                new ArrayList<>()));
    }

    @ExceptionHandler({NullPointerException.class, ArithmeticException.class})
    public ResponseEntity<ApiResponse<? extends ResponseData>> handleRuntimeException(RuntimeException e) {
        Integer code = null;
        String message = "";
        if (e instanceof NullPointerException) {
            code = ResponseStatus.NPE.getCode();
            message = ResponseStatus.NPE.getMessage();
        } else if (e instanceof ArithmeticException) {
            code = ResponseStatus.NPE.getCode();
            message = ResponseStatus.NPE.getMessage();
        }
        return ResponseEntity.badRequest().body(new ApiResponse<>(code, message, null, new ArrayList<>()));
    }
}