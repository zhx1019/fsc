package com.fsc.security.config;

import com.fsc.security.FSCAuthenticationFilter;
import com.fsc.security.FSCUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * Created by I321169 on 3/4/18.
 */

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.
        authorizeRequests().
        antMatchers("/",
                    "/js/**",
                    "/css/**",
                    "/webjars/**").permitAll().
        antMatchers("/user/**").hasAnyRole("ROLE_USER", "ROLE_ADMIN").
        antMatchers("/admin").hasRole("ROLE_ADMIN").
        anyRequest().authenticated().
        and().addFilterBefore(authenticationFilter(), UsernamePasswordAuthenticationFilter.class).
        formLogin().loginPage("/login").permitAll().
        and().logout();
  }

  @Autowired
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    auth.userDetailsService(new FSCUserDetailsService()).passwordEncoder(passwordEncoder);
  }

  @Bean
  public FSCAuthenticationFilter authenticationFilter() throws Exception {
    FSCAuthenticationFilter authFilter = new FSCAuthenticationFilter();
    authFilter.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/login", "POST"));
    authFilter.setAuthenticationManager(authenticationManager());
    authFilter.setUsernameParameter("username");
    authFilter.setPasswordParameter("password");
    return authFilter;
  }

}
