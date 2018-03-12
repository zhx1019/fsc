package com.fsc.security;

import com.fsc.dao.mapper.UserMapper;
import com.fsc.serivce.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * Created by I321169 on 3/6/18.
 */
@Service
public class FSCUserDetailsService implements UserDetailsService{
  private static final Logger log = LoggerFactory.getLogger(FSCUserDetailsService.class);

  @Autowired
  private UserService userService;

  @Override
  public UserDetails loadUserByUsername(String input) throws UsernameNotFoundException {

    String[] split = input.split("@");
    if(split.length < 2) {
      log.debug("please enter both username and companyId");
      throw new UsernameNotFoundException("username and companyId needed");
    }

    log.debug(split[0] + "aaa" + split[1]);
    String username = split[0];
    String companyId = split[1];

    com.fsc.domain.bo.User user = userService.getUserByUsernameAndCompanyId(username, companyId);

    if(user == null) {
      throw new UsernameNotFoundException("Your are not allowed to access to this resource");
    }

    User userdetails = new User(user.getUserName(), user.getPassword(), null);
    return userdetails;
  }
}
