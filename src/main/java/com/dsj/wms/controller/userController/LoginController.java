package com.dsj.wms.controller.userController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class LoginController {

    @RequestMapping(value = "/login")
    public String userLogin(){
        return "userLogin";
    }

    @RequestMapping(value = "/index")
    public String userIndex(){
        return "index";
    }

    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }
}
