package com.meli_play.linktracker.exception;

import com.meli_play.linktracker.dto.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.MalformedURLException;

@ControllerAdvice
class ExceptionHandlerUrl {

    @ExceptionHandler({ValidationUrl.class})
    public ResponseEntity<ExceptionDto> defaultHandle(ValidationUrl e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionDto(e.getMessage()));
    }

    @ExceptionHandler(ValidationPass.class)
    public ResponseEntity<ExceptionDto> defaultHandle(ValidationPass e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionDto(e.getMessage()));
    }
}
