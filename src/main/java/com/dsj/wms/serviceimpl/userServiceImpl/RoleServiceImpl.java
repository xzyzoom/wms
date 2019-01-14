package com.dsj.wms.serviceimpl.userServiceImpl;

import com.dsj.wms.dao.userDao.RoleMapper;
import com.dsj.wms.entity.Role;
import com.dsj.wms.service.userService.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;


    @Override
    public List<Role> selectRoleList() throws Exception {
        return roleMapper.getRoleList();
    }
}
