package com.techreturners.bookmanager.exception;

import org.springframework.http.HttpStatus;

public class CustomException {

    private HttpStatus HttpStatus;
    private String message;

    public CustomException(HttpStatus httpStatus, String message) {
        HttpStatus = httpStatus;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public org.springframework.http.HttpStatus getHttpStatus(){
        return HttpStatus;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
