package com.fsc.controller.custom;

import com.fsc.domain.bo.Custom;
import com.fsc.serivce.CustomService;
import com.fsc.serivce.UserService;
import com.fsc.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/custom")
public class CustomController {
    @Autowired
    private CustomService customService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public PageBean customlist(@AuthenticationPrincipal Principal principal, HttpServletRequest request){
        PageBean pager=customService.getCustomList();
        return pager;
    }

}
