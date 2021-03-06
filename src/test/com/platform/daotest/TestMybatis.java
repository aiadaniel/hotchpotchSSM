package com.platform.daotest;

import com.platform.entity.User;
import com.platform.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:WebContent/WEB-INF/spring-mybatis.xml"})
public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);

    @Autowired
    private UserService userService;

    @Test
    public void testGetUser() {
        User user = userService.getUserById(2);
        System.out.println("==get user {}" + user.getUsername());
    }
}
