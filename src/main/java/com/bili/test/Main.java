package com.bili.test;

import com.bili.bean.Person;
import com.bili.mapper.PersonMapper;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
//        Person person = mapper.getPersonById(1);
//        System.out.println(person);
//        sqlSession.clearCache();
//        sqlSession.close();  //
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration
                .createStandaloneInMemProcessEngineConfiguration();
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/activity");
        configuration.setJdbcDriver("com.mysql.jdbc.Driver");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("lb@21551067");

        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

        ProcessEngine engine = configuration.buildProcessEngine();
        System.out.println(engine.getName());

    }
}
