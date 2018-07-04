package com.qinghuanet.test;

import com.qinghuanet.domain.User;
import com.qinghuanet.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/21 16:05
 */
public class MybatisProxyTest {

    private SqlSessionFactory sqlSessionFactory;

    /**
     * 前置任务-构建SqlSessionFactory
     * @throws IOException
     */
    @Before
    public void buildSqlSessionFactory() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试根据id查询
     */
    @Test
    public void testFindById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findById(10);
        System.out.println(user);
    }

    /**
     * 测试根据name模糊查询
     */
    @Test
    public void testFindByNameWithLike() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findByNameWithLike("许");
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试保存
     */
    @Test
    public void testSave() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "张三", "13800138000", new Date(), "zhangsan@163.com");
        userMapper.save(user);
        sqlSession.commit();
        System.out.println(user);
    }

    /**
     * 测试修改
     */
    @Test
    public void testUpdate() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(12, "李四", "13900139000", new Date(), "lisi@163.com");
        userMapper.update(user);
        sqlSession.commit();
    }

    /**
     * 测试根据id删除
     */
    @Test
    public void testDeleteById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteById(13);
        sqlSession.commit();
    }
}
