package com.qinghuanet.test;

import com.qinghuanet.domain.User;
import com.qinghuanet.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/22 17:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MybatisTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        List<Integer> ids = new ArrayList<>();
        ids.add(10);
        ids.add(11);
        ids.add(12);

        List<User> users = userService.findByIds(ids);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
