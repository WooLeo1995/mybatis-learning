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
import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/22 9:56
 */
public class MybatisTest {

	/**
     * 测试使用where标签查询
     */
    @Test
    public void testFindWithWhere() throws IOException {
        User param = new User();
        param.setName("沈楠");
        param.setMobile("13241233214");

		InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findWithWhere(param);
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试使用set标签修改
     */
    @Test
    public void testUpdateWithSet() throws IOException {
        User param = new User();
        param.setId(12);
        param.setMobile("13241233215");

        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateWithSet(param);
    }

    /**
     * 测试使用trim标签查询
     */
    @Test
    public void testFindWithTrim() throws IOException {
        User param = new User();
        param.setName("沈楠");
        param.setMobile("13241233214");

        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findWithTrim(param);
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试使用trim标签修改
     */
    @Test
    public void testUpdateWithTrim() throws IOException {
        User param = new User();
        param.setId(12);
        param.setMobile("13241233215");

        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateWithTrim(param);
    }
}
