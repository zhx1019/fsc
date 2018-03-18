package com.fsc.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Created by I321169 on 3/17/18.
 */
@Controller
@RequestMapping("/order")
public class WaitingForArrangeCarController {

  @GetMapping(value = "/orders")
  public String index(@AuthenticationPrincipal Principal principal){
    return "orders";
  }

}
