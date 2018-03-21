package com.fsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by I321169 on 3/17/18.
 */
@Controller
@RequestMapping("/order")
public class WaitingForArrangeCarController {

  @RequestMapping(value = "orders", method = RequestMethod.GET)
  public String orders(){
    return "order/orders";
  }

}
