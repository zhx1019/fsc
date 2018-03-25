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

  @Autowired
  private FSCUserDetailsService fscUserDetailsService;

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.
        authorizeRequests().
        antMatchers("/",
                    "/js/**",
                    "/css/**",
                    "/webjars/**",
            "/asset/**",
            "/customer/**",
            "/order/**").permitAll().
        //temporarily comment for developement
//        antMatchers("/asset/**", "/customer/**", "/order/**", "/test").hasAnyRole("USER", "ADMIN").
//        antMatchers("/settings/**").hasRole("ADMIN").
        anyRequest().authenticated().
        and().addFilterBefore(authenticationFilter(), UsernamePasswordAuthenticationFilter.class).
        formLogin().loginPage("/login").failureUrl("/login-error").defaultSuccessUrl("/index").
        permitAll().and().logout().permitAll();
  }

  @Autowired
  protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//    auth.userDetailsService(fscUserDetailsService).passwordEncoder(passwordEncoder);
    auth.userDetailsService(fscUserDetailsService);

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
