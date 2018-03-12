package com.fsc.security;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by I321169 on 3/6/18.
 */
public class FSCAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

  private static final Logger log = LoggerFactory.getLogger(FSCAuthenticationFilter.class);

  @Override
  protected String obtainUsername(HttpServletRequest request) {

    log.debug(request.getParameter("companyId"));
    return request.getParameter("username") + '@' + request.getParameter("companyId");
  }
}
