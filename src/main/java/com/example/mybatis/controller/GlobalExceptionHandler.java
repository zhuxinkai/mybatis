package com.example.mybatis.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * <h3>mybatis</h3>
 * <p>异常处理</p>
 *
 * @author : zhuxinkai
 * @date : 2020-02-03 11:56
 **/
/*
@ControllerAdvice

public class GlobalExceptionHandler {
    //定义错误显示页，error.html

    public static final String DEFAULT_ERROR_VIEW="error";


//适用@ExceptionHandler注解处理局部异常

    @ExceptionHandler(value = {NullPointerException.class})

    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {

        ModelAndView modelAndView = new ModelAndView(DEFAULT_ERROR_VIEW);

        modelAndView.addObject("exceptionObject",e);

        modelAndView.addObject("url",request.getRequestURL());

        return modelAndView;

    }
/*

    @ExceptionHandler(value = {ArithmeticException.class})

    public ModelAndView defaultErrorHandler2(HttpServletRequest request, Exception e) {

        ModelAndView modelAndView = new ModelAndView(DEFAULT_ERROR_VIEW);

        modelAndView.addObject("exceptionObject",e);

        modelAndView.addObject("url",request.getRequestURL());

        return modelAndView;

    }


}

 */
