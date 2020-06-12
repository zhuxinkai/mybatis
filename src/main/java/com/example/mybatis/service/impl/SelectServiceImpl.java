package com.example.mybatis.service.impl;

import com.example.mybatis.mapper.SelectAllPersonMapper;
import com.example.mybatis.model.Person;
import com.example.mybatis.service.SelectAllPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <h3>mybatis</h3>
 * <p>查询所有用户</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-17 10:43
 **/

@Service
@Transactional
public class SelectServiceImpl implements SelectAllPersonService {
    @Autowired
    SelectAllPersonMapper selectAllPersonMapper;
    @Override
    public List<Person> findAllPerson() {
        List<Person> personList = selectAllPersonMapper.selectAllPerson();
        return personList;



    }
}
