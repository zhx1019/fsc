package com.fsc.controller.order;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by I321169 on 3/17/18.
 */
@Controller
@RequestMapping("/order")
public class WaitingForArrangeCarController {

  @RequestMapping(value = "orders", method = RequestMethod.GET)
  public String orders(@AuthenticationPrincipal Principal principal, HttpServletRequest request){
    String companyId = request.getSession().getAttribute("companyId").toString();
    return "order/orders";
  }

}
