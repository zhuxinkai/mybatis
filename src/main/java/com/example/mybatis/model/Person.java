package com.example.mybatis.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * <h3>mybatis</h3>
 * <p>user</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-16 14:11
 **/


public class Person {
    /*
4.1 JSR提供的标准注解

@Null   被注释的元素必须为 null
@NotNull    被注释的元素必须不为 null
@AssertTrue     被注释的元素必须为 true
@AssertFalse    被注释的元素必须为 false
@Min(value)     被注释的元素必须是一个数字，其值必须大于等于指定的最小值
@Max(value)     被注释的元素必须是一个数字，其值必须小于等于指定的最大值
@DecimalMin(value)  被注释的元素必须是一个数字，其值必须大于等于指定的最小值
@DecimalMax(value)  被注释的元素必须是一个数字，其值必须小于等于指定的最大值
@Size(max=, min=)   被注释的元素的大小必须在指定的范围内
@Digits (integer, fraction)     被注释的元素必须是一个数字，其值必须在可接受的范围内
@Past   被注释的元素必须是一个过去的日期
@Future     被注释的元素必须是一个将来的日期
@Pattern(regex=,flag=)  被注释的元素必须符合指定的正则表达式




4.2，Hibernate Validator提供的校验注解

@NotBlank(message =)   验证字符串非null，且长度必须大于0
@Email  被注释的元素必须是电子邮箱地址
@Length(min=,max=)  被注释的字符串的大小必须在指定的范围内
@NotEmpty   被注释的字符串的必须非空
@Range(min=,max=,message=)  被注释的元素必须在合适的范围内



     */
  @NotBlank(message = "姓名不能为空")  //该规则是针对字符型的数据，对于整型数据不适用。
    private String name;
    //@Pattern(regexp = "d{2}$",message = "年龄输入错误")
   //@NotBlank(message = "年龄不能为空")
   @Min(value = 1,message = "年龄不符合规则") @Max(value = 105,message = "年龄不符合规则")
    private int age;
    @NotBlank(message = "地址不能为空")
    private String address;
    @Length(min = 8,max = 16,message = "密码长度必须为8-16位")
    @Pattern(regexp = "^(?![a-zA-z]+$)(?!\\d+$)(?![!@#$%^&*.]+$)[a-zA-Z\\d!@#$%^&*]+$",message = "密码必须符合复杂性要求")
    private String password;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }
}
