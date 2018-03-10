package com.fsc.security;

import com.fsc.serivce.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;



/**
 * Created by I321169 on 3/6/18.
 */
@Repository
public class FSCUserDetailsService implements UserDetailsService{
  private static final Logger LOGGER = Logger.getLogger(FSCUserDetailsService.class);

  @Autowired
  private UserService userService;

  @Override
  public UserDetails loadUserByUsername(String input) throws UsernameNotFoundException {

    String[] split = input.split("@");
    if(split.length < 2) {
      LOGGER.debug("please enter both username and companyId");
      throw new UsernameNotFoundException("username and companyId needed");
    }

    String username = split[0];
    String companyId = split[1];

    com.fsc.domain.bo.User user = userService.getUserByUsernameAndCompanyId(username, companyId);

    if(user == null) {
      throw new UsernameNotFoundException("Your are not allowed to access to this resource");
    }

    User userdetails = new User(user.getUserName(), user.getUserName(), null);
    return userdetails;
  }
}
