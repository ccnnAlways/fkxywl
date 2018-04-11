package com.fkxywl.common.mvc.handler;

import com.fkxywl.common.api.bean.Result;
import com.fkxywl.common.api.constant.ErrorCodes;
import com.fkxywl.common.api.exception.ValidateException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ssr on 2017/3/21.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result<?> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        if(e instanceof ValidateException) {
            ValidateException ve = (ValidateException)e;
            return Result.createFailResult(ve.getCode(), ve.getMessage());
        }

        return Result.createFailResult(ErrorCodes.SYSTEM_EXCEPTION);
    }
}
