package com.dsj.wms.controller.userController;

import com.dsj.wms.entity.Role;
import com.dsj.wms.service.userService.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Resource
    private RoleService roleService;

    @RequestMapping(value = "roleList")
    public String selectUserList(Model model){
        List<Role> roleList = null;
        try {
            roleList = roleService.selectRoleList();
            if(roleList!=null){
                model.addAttribute("roleList",roleList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "roleList";
    }

}
