package com.example.mybatis.service;

import com.example.mybatis.model.Person;

public interface SelectPersonService {

    Person selectPersonByName(String name);
    void updatePersonByName(Person persons);
    void deletePersonByName(String name);
}




