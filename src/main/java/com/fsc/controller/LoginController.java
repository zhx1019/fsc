package com.fsc.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.naming.Context;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

/**
 * Created by I321169 on 2/26/18.
 */

@Controller
public class LoginController {

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response) {
        return "login";
    }

    @GetMapping("/index")
    public String user(@AuthenticationPrincipal Principal principal, Model model) {
        model.addAttribute("username", principal.getName());
        return "index";
    }

    @GetMapping("/BasicScripts")
    public String BasicScripts(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("X-Frame-Options", "SAMEORIGIN");
        return "masters/BasicScripts";
    }


    @GetMapping("/resourceList")
    public String resource(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("X-Frame-Options", "SAMEORIGIN");
        return "resource/resourceList";
    }

    @GetMapping("/customList")
    public String customList(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("X-Frame-Options", "SAMEORIGIN");
        return "custom/customList";
    }


    @RequestMapping(value = "/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

    @RequestMapping(value = "/menu")
    public String menu(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("X-Frame-Options", "SAMEORIGIN");
        return "menu";
    }


    /*
    * 订单管理页面跳转
    * */
    @RequestMapping(value = "/excuteOrderList")
    public String excuteOrderList(HttpServletRequest request, HttpServletResponse response ) {
        response.setHeader("X-Frame-Options", "SAMEORIGIN");
        return "order/excuteOrderList";
    }

    @RequestMapping(value = "/waitingOrderList")
    public String waitingOrderList(HttpServletRequest request, HttpServletResponse response ) {
        response.setHeader("X-Frame-Options", "SAMEORIGIN");
        return "order/waitingOrderList";
    }

}
