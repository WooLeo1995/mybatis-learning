package com.qinghuanet.test;

import com.qinghuanet.domain.User;
import com.qinghuanet.domain.VO;
import com.qinghuanet.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qinghua
 * @date 2018/6/22 9:56
 */
public class MybatisTest {

	/**
     * 测试基本数据类型取值
     */
    @Test
    public void testFindById() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findById(17);
        System.out.println(user);
    }

    /**
     * 测试对象或VO类型取值
     */
    @Test
    public void testFindByVO() throws IOException {
        User user = new User();
        user.setId(18);

        VO vo = new VO();
        vo.setUser(user);

        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findByVO(vo);
        for (User u : users) {
            System.out.println(u);
        }
    }

    /**
     * 测试Map类型取值
     */
    @Test
    public void testFindByMap() throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("name", "陈明");
        map.put("birthday", "1991-10-30");

        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findByMap(map);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
