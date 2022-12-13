package com.vtxlab.project.cryptoapp.exception;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class ApiException extends Exception {
    int code;

    String msg;

    public ApiException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
