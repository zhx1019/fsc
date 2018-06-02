package com.fsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by I321169 on 3/30/18.
 */

@Controller
public class JucheController {

  @RequestMapping(value="/juche",method = RequestMethod.GET)
  public String juche(HttpServletRequest request){
    return "juche";
  }
}
