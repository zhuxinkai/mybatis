package com.example.mybatis.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <h3>mybatis</h3>
 * <p>实现HandlerExceptionResolver</p>
 *
 * @author : zhuxinkai
 * @date : 2020-02-03 20:51
 **/

@Configuration
public class HandlerExceptionResolverImpl implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","实现HandlerExceptionResolver接口处理异常");
        //判断不同异常类型，做不同视图跳转
        if(e instanceof ArithmeticException){
            modelAndView.setViewName("error");

        }
        return modelAndView;

    }
}
