package com.example.mybatis.service.impl;

import com.example.mybatis.mapper.RegeisterMapper;
import com.example.mybatis.model.Person;
import com.example.mybatis.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <h3>mybatis</h3>
 * <p>impl</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-16 16:40
 **/

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
    @Autowired
    private RegeisterMapper regeisterMapper;


    @Override
    public void addPerson(Person persons) {
        this.regeisterMapper.insertPerson(persons);

    }
}
