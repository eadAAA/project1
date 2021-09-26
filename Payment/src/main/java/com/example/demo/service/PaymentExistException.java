package com.example.demo.service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class PaymentExistException extends RuntimeException{
    public PaymentExistException(String message){
        super(message);
    }
}
