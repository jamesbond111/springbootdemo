package com.bili.mapper;

import com.bili.bean.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PersonMapper {
    @Select("select * from person where id=#{id}")
    public Person getPersonById(Integer id);

    @Delete("delete from person where id = #{id}")
    public int deletePersonById(Integer id);

    @Insert("insert into person(name,age) values (#{name},#{age})")
    public int insertPerson(Person person);

    @Update("update person set name=#{name} where id = #{id}")
    public int updatePerson(Person person);
}
