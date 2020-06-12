package com.example.mybatis.service.impl;
import com.example.mybatis.mapper.SelectPersonMapper;
import com.example.mybatis.model.Person;
import com.example.mybatis.service.SelectPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <h3>mybatis</h3>
 * <p>查询单个用户实现</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-29 14:59
 **/

@Service
@Transactional

public class SelectPersonServiceImpl implements SelectPersonService {
    @Autowired
    SelectPersonMapper selectPerson;

    @Override
    public Person selectPersonByName(String name) {
        return this.selectPerson.SelectPerson(name);

    }

    @Override
    public void updatePersonByName(Person persons){

        this.selectPerson.UpdatePerson(persons);
    }

    @Override
    public void deletePersonByName(String name){
       this.selectPerson.DeletePerson(name);


    }

}
