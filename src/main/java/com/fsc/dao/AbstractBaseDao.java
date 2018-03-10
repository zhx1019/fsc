package com.fsc.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;

/**
 * Created by I321169 on 3/10/18.
 */
public abstract class AbstractBaseDao extends SqlSessionDaoSupport {
  @Resource
  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
    super.setSqlSessionFactory(sqlSessionFactory);
  }
}
