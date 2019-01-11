package com.dsj.wms.controller.userController;

import com.dsj.wms.entity.User;
import com.dsj.wms.service.userService.UserService;
import com.dsj.wms.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    //登录跳转页面
    @RequestMapping(value = "/login")
    public String login() {
        return "userLogin";
    }

    //处理登录
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String userLogin(@RequestParam String userName, @RequestParam String passWord, HttpServletRequest request, HttpSession session, Model model) {
        // 调用service方法，进行用户匹配
        User user = null;
        try {
            user = userService.userLogin(userName, passWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (null != user) {// 登录成功
            // 放入session
            session.setAttribute(Constants.USER_SESSION, user);
            model.addAttribute("user", user);
            // 页面跳转
            return "index";
        } else {
            // 页面跳转（login.jsp）带出提示信息--转发
            request.setAttribute("error", "用户名或密码不正确");
            return "userLogin";
        }
    }

    //登陆成功
    @RequestMapping(value = "/index")
    public String index(HttpSession session) {
        if (session.getAttribute(Constants.USER_SESSION) == null) {
            return "redirect:/user/login";
        }
        return "index";
    }

    //退出登录
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        //清除session
        session.removeAttribute(Constants.USER_SESSION);
        return "userLogin";
    }

    //用户列表
    @RequestMapping(value = "/userList")
    public String selectUserList(Model model) {
        List<User> userList = null;
        try {
            userList = userService.selectUserList();
            if (userList != null) {
                model.addAttribute("list", userList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "userList";
    }


}
