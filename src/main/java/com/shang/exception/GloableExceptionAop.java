package com.shang.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author sjy
 * @Create 2019-02-24 19:12
 * @Description TODO
 * @Version 1.0
 **/
@ControllerAdvice
@Slf4j
public class GloableExceptionAop {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String runtimeException(RuntimeException e) {
        log.error("运行时异常",e);
        String message = e.getMessage();
        return message;
    }
}
