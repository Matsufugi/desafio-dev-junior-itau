package com.itau.task.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CamposInvalidosException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public void formularioInvalidadoException(CamposInvalidosException ex) {
        log.error("e: ", ex);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public void httpMessageNotReadableException() {
    }

    @ExceptionHandler(ValorNegativoException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public void valorNegativoException(ValorNegativoException ex) {
        log.error("e: ", ex);
    }
}