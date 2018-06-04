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

    @GetMapping("/resource")
    public String resource() {
        return "resource/resourceList";
    }

    @GetMapping("/customlist")
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

    @RequestMapping(value = "/resourcelist")
    public String resourcelist(HttpServletRequest request, HttpServletResponse response ) {
        response.setHeader("X-Frame-Options", "SAMEORIGIN");
        return "resourcelist";
    }

    @RequestMapping(value = "/blank")
    public String blank(HttpServletRequest request, HttpServletResponse response ) {
        response.setHeader("X-Frame-Options", "SAMEORIGIN");
        return "blank";
    }

    @RequestMapping(value = "/excuteOrderList")
    public String excuteOrderList(HttpServletRequest request, HttpServletResponse response ) {
        response.setHeader("X-Frame-Options", "SAMEORIGIN");
        return "excuteOrderList";
    }


    @RequestMapping(value = "/test")
    public String test( ) {
        return "test";
    }
}
