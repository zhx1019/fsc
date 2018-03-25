package com.fsc.serivce;

import com.fsc.dao.mapper.UserMapper;
import com.fsc.domain.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by I321169 on 3/10/18.
 */

@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public User getUserByUsernameAndCompanyId(String username, String companyId) {
    User user = userMapper.getUserByUsernameAndCompanyId(username, companyId);
    return user;
  }

  public List<User> getAllUser(){
    return userMapper.selectByExample(null);
  }
}
