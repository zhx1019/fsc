package com.fsc.security;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by I321169 on 3/6/18.
 */
public class FSCAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

  private static final Logger log = LoggerFactory.getLogger(FSCAuthenticationFilter.class);

  @Override
  protected String obtainUsername(HttpServletRequest request) {

    log.debug(request.getParameter("companyId"));
    request.getSession().setAttribute("companyId", request.getParameter("companyId"));
    return request.getParameter("username") + '@' + request.getParameter("companyId");
  }

  @Override
  protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
                                          FilterChain chain, Authentication authResult) throws IOException, ServletException {
    setAuthenticationSuccessHandler(new SimpleUrlAuthenticationSuccessHandler("/index"));
    super.successfulAuthentication(request, response, chain, authResult);
  }

  @Override
  protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
                                            AuthenticationException failed) throws IOException, ServletException {

    setAuthenticationFailureHandler(new SimpleUrlAuthenticationFailureHandler("/login-error"));
    super.unsuccessfulAuthentication(request, response, failed);
  }
}
