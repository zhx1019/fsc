package com.fsc.serivce;

import com.fsc.dao.UserDao;
import com.fsc.domain.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by I321169 on 3/10/18.
 */

@Service
public class UserService {

  @Autowired
  private UserDao userDao;

  public User getUserByUsernameAndCompanyId(String username, String companyId) {
    return userDao.getUserByUsernameAndCompanyId(username, companyId);
  }
}
