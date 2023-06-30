package com.knoldus.assignmentmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.time.LocalDateTime;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<Object> handleInternNotFound(final ResourceNotFound ex) {
        return new ResponseEntity<>(new ApiError(ex.getMessage(),
                HttpStatus.NOT_FOUND,
                LocalDateTime.now()),
                HttpStatus.NOT_FOUND);
    }
}
