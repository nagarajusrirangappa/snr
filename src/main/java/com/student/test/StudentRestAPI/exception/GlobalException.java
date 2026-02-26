package com.student.test.StudentRestAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice // deprecated //2.point
//@RestControllerAdvice // combination of @RestController+ @ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler { //1.extends ResponseEntityExceptionHandler


    @ExceptionHandler(Exception.class) //500 - internal server error //3.point
    public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request){
        ExceptionResponse exceptionResponse= new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
        return  new ResponseEntity<Object>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CustomerNotFoundException.class) //500 - internal server error //3.point
    public final ResponseEntity<Object> handleNotFoundException(CustomerNotFoundException ex, WebRequest request){
        ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(true));
        return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
    }




}
