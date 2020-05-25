package com.xsbl.mybatis_hello.test_hello;

import com.xsbl.mybatis_hello.bean.Employee;
import com.xsbl.mybatis_hello.dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @描述:
 * @创建人: Isaac
 * @创建日期: 2020/5/25 22:36
 */
public class TestHello {

  public SqlSessionFactory getSqlSessionFactory() throws IOException {
    String resource = "mybatis-config.xml";
    InputStream resourceAsStream = Resources.getResourceAsStream(resource);
    return new SqlSessionFactoryBuilder().build(resourceAsStream);
  }



  public void test01() throws IOException {
    //1.获取SQLSessionFactory对象
    SqlSessionFactory sessionFactory = getSqlSessionFactory();
    //2.获取SqlSession 对象
    SqlSession sqlSession = sessionFactory.openSession();
    try {
    //3.获取接口的实现类对象
    //会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
      EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
      Employee empById = mapper.getEmpById(1);
      System.out.println(mapper.getClass());
      System.out.println(empById);
    }finally {
      sqlSession.close();
    }

  }

}
