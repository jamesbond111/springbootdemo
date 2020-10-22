package com.bili;


import com.bili.bean.Person;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityTest {

    @Test
    public void initProcessEngine() throws SQLException {
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
