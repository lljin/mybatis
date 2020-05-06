package com.lljin;

import static org.junit.Assert.assertTrue;

import com.lljin.entity.Author;
import com.lljin.entity.Business;
import com.lljin.mapper.AuthorMapper;
import com.lljin.mapper.BusinessMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testMybatis() {
        final InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("mybatisConfig.xml");
        final SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        final SqlSession sqlSession = sqlSessionFactory.openSession();
        final BusinessMapper mapper = sqlSession.getMapper(BusinessMapper.class);
        Business business = new Business();
        business.setName("咕泡学院");
        business.setScope(Arrays.asList(1,2,3,4,5));
        System.out.println(business.toString());
        final int i = mapper.addBusiness(business);
        int id = business.getId();
        System.out.println(id);
        final Business businessById = mapper.getBusinessById(id);
        System.out.println(businessById);
        sqlSession.commit();
        sqlSession.close();
    }
}
