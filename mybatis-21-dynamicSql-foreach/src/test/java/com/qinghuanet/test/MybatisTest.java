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
import java.util.*;

/**
 * @author qinghua
 * @date 2018/6/22 9:56
 */
public class MybatisTest {

	/**
     * 测试使用foreach标签迭代list和array
     */
    @Test
    public void test() throws IOException {
        List<Integer> idList = new ArrayList<>();
        idList.add(10);
        idList.add(11);
        idList.add(12);

        int[] idArray = {10, 11, 12};

		InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findByIds(idList);
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试迭代map
     */
    @Test
    public void testBatchSave() throws IOException {
        Map<String, User> map = new HashMap<>();
        map.put("zhangsan", new User(null, "张三", "13800138000", new Date(), "zhangsan@163.com"));
        map.put("lisi", new User(null, "李四", "13900139000", new Date(), "lisi@163.com"));

        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.batchSave(map);
    }
}
