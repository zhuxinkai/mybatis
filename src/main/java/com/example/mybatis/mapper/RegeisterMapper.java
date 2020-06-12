package com.example.mybatis.mapper;

import com.example.mybatis.model.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegeisterMapper {
    void insertPerson(Person persons);


}
