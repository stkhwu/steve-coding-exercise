package com.vtxlab.project.crypto.polygon.exception;

public class ApiException extends Exception {

    int code;

    String msg;

    public ApiException(int code, String msg){
        super(msg);
        this.code = code;
    }
}
