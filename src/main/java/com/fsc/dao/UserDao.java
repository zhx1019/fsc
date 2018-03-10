package com.fsc.dao;

import com.fsc.dao.mapper.UserMapper;
import com.fsc.domain.bo.User;
import com.fsc.domain.bo.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by I321169 on 3/10/18.
 */

@Repository
public class UserDao extends AbstractBaseDao implements UserMapper{

  @Override
  public long countByExample(UserExample example) {
    return 0;
  }

  @Override
  public int deleteByExample(UserExample example) {
    return 0;
  }

  @Override
  public int deleteByPrimaryKey(Integer userId) {
    return 0;
  }

  @Override
  public int insert(User record) {
    return 0;
  }

  @Override
  public int insertSelective(User record) {
    return 0;
  }

  @Override
  public List<User> selectByExample(UserExample example) {
    return null;
  }

  @Override
  public User selectByPrimaryKey(Integer userId) {
    return null;
  }

  @Override
  public int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example) {
    return 0;
  }

  @Override
  public int updateByExample(@Param("record") User record, @Param("example") UserExample example) {
    return 0;
  }

  @Override
  public int updateByPrimaryKeySelective(User record) {
    return 0;
  }

  @Override
  public int updateByPrimaryKey(User record) {
    return 0;
  }

  @Override
  public User getUserByUsernameAndCompanyId(@Param("username") String username, @Param("companyId") String companyId) {
    return this.getSqlSession().getMapper(UserMapper.class).getUserByUsernameAndCompanyId(username, companyId);
  }
}
