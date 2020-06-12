package com.example.mybatis.mapper;

import com.example.mybatis.model.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SelectPersonMapper {
    Person SelectPerson(String name);
    void UpdatePerson(Person persons);
    void DeletePerson(String name);

}
