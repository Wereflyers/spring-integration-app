package com.example.springintegrationproject.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Arrays;

@RestControllerAdvice
@Slf4j
public class ErrorHandler {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiError handleNullException(final NullPointerException e) {
        log.info("NullPointerException " + Arrays.toString(e.getStackTrace()));
        return new ApiError("NOT_FOUND", "The required object was not found.", e.getMessage());
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiError handleException(final Exception e) {
        log.info("Exception " + Arrays.toString(e.getStackTrace()));
        return new ApiError("BAD_REQUEST", "Incorrectly made request", e.getMessage());
    }

    @MessageExceptionHandler
    public void handleFailed(Exception e) {
        log.info("Exception " + Arrays.toString(e.getStackTrace()));
    }
}
