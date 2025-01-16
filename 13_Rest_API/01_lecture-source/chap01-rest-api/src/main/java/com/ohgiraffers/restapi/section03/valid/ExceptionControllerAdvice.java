package com.ohgiraffers.restapi.section03.valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {

    // 사용자 정의의 예외가 발생했을 때 낚아채는 Handler
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(UserNotFoundException e) {
        String code = "ERROR_CODE_001";
        String description = "없는 회원 정보입니다. 확인하세요";
        String detail = e.getMessage();

        return new ResponseEntity<>(new ErrorResponse(code, description, detail), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> methodValid(MethodArgumentNotValidException e) {

        // 클래스에서 제공하는 데이터로 넣기 위해 빈값 처리
        String code = "";
        String description = "";
        String detail = "";

        /* 유효성 검사 시 Error 발생하면?? */
        if(e.getBindingResult().hasErrors()) {
            detail = e.getBindingResult().getFieldError().getDefaultMessage();

            // 발생한 ErrorCode - ex) NotNull, NotBlank 등등
            String bindCode = e.getBindingResult().getFieldError().getCode();

            switch (bindCode) {
                case "NotBlank" :
                    code = "ERROR_CODE_002";
                    description = "필수 값이 누락됨!!";
                    break;
                case "Size" :
                    code = "ERROR_CODE_003";
                    description = "글자 수를 확인하십쇼..";
                    break;
            }

        }

        return new ResponseEntity<>(new ErrorResponse(code, description, detail), HttpStatus.BAD_REQUEST);
    }

}
