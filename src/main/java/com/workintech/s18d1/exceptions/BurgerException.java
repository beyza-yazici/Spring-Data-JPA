package com.workintech.s18d1.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class BurgerException extends RuntimeException{
    private HttpStatus httpStatus;

    public BurgerException(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public BurgerException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public BurgerException(String message, Throwable cause, HttpStatus httpStatus) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }

    public BurgerException(Throwable cause, HttpStatus httpStatus) {
        super(cause);
        this.httpStatus = httpStatus;
    }

    public BurgerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, HttpStatus httpStatus) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.httpStatus = httpStatus;
    }
}
