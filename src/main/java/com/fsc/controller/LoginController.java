package com.fsc.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

/**
 * Created by I321169 on 2/26/18.
 */

@Controller
public class LoginController {

  @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
  public String login(HttpServletRequest request, HttpServletResponse response){
    return "login";
  }

  @GetMapping("/index")
  public String user(@AuthenticationPrincipal Principal principal, Model model){
    model.addAttribute("username", principal.getName());
    return "index";
  }

  @RequestMapping(value = "/login-error")
  public String loginError(Model model){
    model.addAttribute("loginError", true);
    return "login";
  }

  @RequestMapping(value = "/test")
  public String test(Model model){
    return "test";
  }
}
