package com.bili.controller;

import com.bili.bean.Person;
import com.bili.mapper.PersonMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${user.name}")
    private String name;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    PersonMapper personMapper;

    //模拟Rest风格
    @ResponseBody
    @RequestMapping("/hello/{id}")
    public Person hello(@PathVariable("id") Integer id){
        logger.trace("processing request");
        return personMapper.getPersonById(id);
    }

    //使用thymeleaf模板引擎
    @RequestMapping("/suc")
    public String suc(Map<String, Object> map){
        map.put("user","james");
        return "success";
    }
}
