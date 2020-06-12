package com.example.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <h3>mybatis</h3>
 * <p>测试mybatis数据库sqlinjection</p>
 *
 * @author : zhuxinkai
 * @date : 2020-06-11 21:32
 **/

@Controller
@SpringBootApplication()

public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class,args);

    }
}
