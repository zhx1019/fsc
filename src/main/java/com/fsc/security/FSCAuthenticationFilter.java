package com.fsc.security;


import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by I321169 on 3/6/18.
 */
public class FSCAuthenticationFilter extends UsernamePasswordAuthenticationFilter {


  @Override
  protected String obtainUsername(HttpServletRequest request) {

    return request.getParameter("name") + '@' + request.getParameter("companyId");
  }
}
