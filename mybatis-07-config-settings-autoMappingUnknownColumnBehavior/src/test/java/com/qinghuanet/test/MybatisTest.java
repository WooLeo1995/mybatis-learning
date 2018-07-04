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
 * @date 2018/6/22 9:43
 */
public class MybatisTest {

    /**
     * 测试自动映射异常时的行为
     * 当前User类中没有did属性，自动映射时会出现未知的列
     */
    @Test
    public void test() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findById(12);
        System.out.println(user);
    }
}
