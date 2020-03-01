package com.bili;


import com.bili.bean.Person;
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
public class MainTest {
    @Autowired
    Person p;

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(p);
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        String hashpw = BCrypt.hashpw("123", BCrypt.gensalt());
        boolean isMatch = BCrypt.checkpw("123", "$2a$10$6mpClLb3N04NfM7YwDZY4uVVXQRpbAo9PUaAku8erbQu7nN4sqgLS");

    }
}
