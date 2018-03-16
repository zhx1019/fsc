package com.fsc.security;


import com.fsc.domain.bo.Role;
import com.fsc.serivce.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


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

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    log.info(passwordEncoder.encode("jack123"));
    log.info(passwordEncoder.encode("admin123"));
    log.info(passwordEncoder.encode("dba123"));

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

    List<SimpleGrantedAuthority> authorities = new ArrayList<>();
    for(Role role : user.getRoles()) {
      authorities.add(new SimpleGrantedAuthority(role.getRoleType()));
    }
    User userdetails = new User(user.getUserName(), user.getPassword(), authorities);
    return userdetails;
  }
}
