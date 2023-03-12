package com.techreturners.bookmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookHandlerException {

    @ExceptionHandler(value= {BookNotFoundException.class})
    public ResponseEntity<Object> handleBookNotFoundException(BookNotFoundException e) {
        CustomException getException = new CustomException(HttpStatus.NOT_FOUND, e.getMessage());
        return new ResponseEntity<>(getException, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value= {BookAlreadyExistsException.class})
    public ResponseEntity<Object> handleBookAlreadyExistsException(BookAlreadyExistsException e) {
        CustomException getException = new CustomException(HttpStatus.BAD_REQUEST, e.getMessage());
        return new ResponseEntity<>(getException, HttpStatus.BAD_REQUEST);
    }
}
