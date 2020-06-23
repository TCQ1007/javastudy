package com.cdut.javastudy.dao;

import com.cdut.javastudy.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//Data Access Object 数据库操作
//具体实现在mapper目录
@Mapper
@Repository
public interface PersonDao {
    Person getById(Integer id);
    void AddPerson(Person person);
    void DeletePerson(Person person);
}
