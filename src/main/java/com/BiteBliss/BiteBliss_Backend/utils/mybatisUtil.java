package com.BiteBliss.BiteBliss_Backend.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
  private static SqlSessionFactory sqlSessionFactory;
  //静态初始化块
  static {
    try {
      InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); // 初始化sqlSessionFactory
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static SqlSession getSqlSession() {
    return sqlSessionFactory.openSession(true);
  }
}
