package com.zd.common.exception;

public class BaseException extends RuntimeException {

    private int status = 200;

    public BaseException(int status) {
        this.status = status;
    }

    public BaseException(String message, int status) {
        super(message);
        this.status = status;
    }

    public BaseException(String message, Throwable cause, int status) {
        super(message, cause);
        this.status = status;
    }

    public BaseException(Throwable cause, int status) {
        super(cause);
        this.status = status;
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int status) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
