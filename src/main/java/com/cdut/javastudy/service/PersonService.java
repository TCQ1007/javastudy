package com.cdut.javastudy.service;

import com.cdut.javastudy.dao.PersonDao;
import com.cdut.javastudy.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public Person getById(Integer id){
        return personDao.getById(id);
    }
}
