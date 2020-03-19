package com.springboot.demo.exception;

import com.springboot.demo.common.RespStatusCode;
import com.springboot.demo.common.ResponseWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ldb
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseWrapper<String> handleException(Exception e) {
        // 统一走日志记录
        log.error("系统错误：", e);
        return ResponseWrapper.markCustom(RespStatusCode.SYSTEM_INNER_ERROR, RespStatusCode.SYSTEM_INNER_ERROR.getMsg(),
                null);
    }
}
