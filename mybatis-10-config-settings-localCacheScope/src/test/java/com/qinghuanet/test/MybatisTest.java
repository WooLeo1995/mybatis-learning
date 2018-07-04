package com.qinghuanet.test;

import com.qinghuanet.domain.User;
import com.qinghuanet.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author qinghua
 * @date 2018/6/22 9:56
 */
public class MybatisTest {

	/**
     * 测试一级缓存
     */
    @Test
    public void test() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setId(15);
        user.setEmail("123456789@qq.com");

        //连续查询两次，观察不同的设置下发送的SQL语句
        System.out.println(userMapper.findById(15));
        userMapper.updateEmail(user);
        System.out.println(userMapper.findById(15));
    }
}
