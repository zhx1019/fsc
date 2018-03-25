package com.fsc.controller.order;

import com.fsc.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by I321169 on 3/24/18.
 */

@Controller
@RequestMapping("/order")
public class CreateOrderController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "createOrder", method = RequestMethod.GET)
  public String co(@AuthenticationPrincipal Principal principal, HttpServletRequest request, Model model) {
    model.addAttribute("cities", userService.getAllUser());
    return "order/createOrder";
  }

  @RequestMapping(value = "createOrder", method = RequestMethod.POST)
  public String createOrder() {


    return "redirect:order/orders";
  }
}
