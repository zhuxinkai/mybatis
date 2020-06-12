package com.example.mybatis.mapper;

import com.example.mybatis.model.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SelectAllPersonMapper {
    List<Person> selectAllPerson();


}

