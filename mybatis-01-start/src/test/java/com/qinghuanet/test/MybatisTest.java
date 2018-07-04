package com.qinghuanet.test;

import com.qinghuanet.domain.User;
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
 * @date 2018/6/21 15:28
 */
public class MybatisTest {

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
        List<User> users = sqlSession.selectList("com.qinghuanet.mapper.UserMapper.findAll");
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
        User user = sqlSession.selectOne("com.qinghuanet.mapper.UserMapper.findById", 10);
        System.out.println(user);
    }

    /**
     * 测试根据name模糊查询
     */
    @Test
    public void testFindByNameWithLike() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList(
                "com.qinghuanet.mapper.UserMapper.findByNameWithLike", "许");
        System.out.println(users.size());
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
        User user = new User(null, "张三", "13800138000", new Date(), "zhangsan@163.com");
        sqlSession.insert("com.qinghuanet.mapper.UserMapper.save", user);
        sqlSession.commit();
        System.out.println(user);
    }

    /**
     * 测试修改
     */
    @Test
    public void testUpdate() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User(12, "李四", "13900139000", new Date(), "lisi@163.com");
        sqlSession.update("com.qinghuanet.mapper.UserMapper.update", user);
        sqlSession.commit();
    }

    /**
     * 测试根据id删除
     */
    @Test
    public void testDeleteById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("com.qinghuanet.mapper.UserMapper.deleteById", 12);
        sqlSession.commit();
    }
}
