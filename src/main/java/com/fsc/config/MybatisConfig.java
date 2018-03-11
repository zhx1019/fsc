package com.fsc.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by I321169 on 3/11/18.
 */
@Configuration
public class MybatisConfig {
  @Autowired
  private DataSourceProperties dataSourceProperties;


  @Bean(name = "dataSource")
  public DataSource dataSource() {

    DataSource dataSource = new DataSource();
    dataSource.setUrl(dataSourceProperties.getUrl());
    System.out.println(dataSourceProperties.getUrl());
    dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
    dataSource.setUsername(dataSourceProperties.getUsername());
    dataSource.setPassword(dataSourceProperties.getPassword());

    return dataSource;

  }

  public SqlSessionFactory sqlSessionFactory() throws Exception {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(dataSource());
    return sqlSessionFactoryBean.getObject();
  }
}
