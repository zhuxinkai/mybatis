package com.example.mybatis.service;

import com.example.mybatis.model.Person;

import java.util.List;

public interface SelectAllPersonService {
    List<Person> findAllPerson();
}
