package com.zz.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zzpdream on 2017/7/18.
 */

@Controller
public class MainControl {

    @RequestMapping(value="/")
    public String index(Model model){
        return "login";
    }

    @RequestMapping(value="/login")
    public String login(Model model){
        return "main";
    }
}
