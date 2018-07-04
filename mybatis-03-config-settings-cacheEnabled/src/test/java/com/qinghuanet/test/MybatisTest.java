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
 * @date 2018/6/21 17:25
 */
public class MybatisTest {

    /**
     * 测试二级缓存
     * 开启/关闭二级缓存后，观察两次查询发送的sql语句
     * @throws IOException
     */
    @Test
    public void test() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获得会话进行一次查询
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findById(10);
        System.out.println(user);
        //关闭此次会话
        sqlSession.close();

        //重新获得会话并再次查询
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
        user = userMapper.findById(10);
        System.out.println(user);
    }
}
