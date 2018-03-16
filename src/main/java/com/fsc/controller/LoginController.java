package com.fsc.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

/**
 * Created by I321169 on 2/26/18.
 */

@Controller
public class LoginController {

  @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
  public ModelAndView login(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("login");
    return modelAndView;
  }

  @GetMapping("/index")
  public String user(@AuthenticationPrincipal Principal principal, Model model){
    model.addAttribute("username", principal.getName());
    return "index";
  }
}
