package com.fsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by I321169 on 3/17/18.
 */

@Controller
@RequestMapping("/settings")
public class SettingsController {

  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String index(){
    return "settings/index";
  }

}
