package com.dsj.wms.controller.userController;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/admin")
public class LoginController {

    @RequestMapping(value = "/login")
    public String userLogin(){
        return "login";
    }
}
