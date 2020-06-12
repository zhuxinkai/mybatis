package com.example.mybatis.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * <h3>mybatis</h3>
 * <p>SimpleMappingExceptionResolver 类处理异常</p>
 *
 * @author : zhuxinkai
 * @date : 2020-02-03 20:38
 **/
/*


@Configuration
public class GlobalException {

    @Bean
    public SimpleMappingExceptionResolver
    getSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();

        Properties mappings = new Properties();
        /*
         * 参数一：异常的类型，注意必须是异常类型的全名
         * 参数二：视图名称

        mappings.put("java.lang.ArithmeticException", "error");

        //设置异常与视图映射信息的
        resolver.setExceptionMappings(mappings);

        return resolver;
    }


}
                */
