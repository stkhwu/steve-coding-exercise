package com.vtxlab.project.crypto.polygon.exception;

import lombok.Data;

@Data
public class ApiRunTimeException extends RuntimeException {
    int code;

    String msg;

    public ApiRunTimeException(Throwable throwable){
        super(throwable);
    }
}
