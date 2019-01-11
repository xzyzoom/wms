package com.dsj.wms.service.userService;

import com.dsj.wms.entity.Role;

import java.util.List;

public interface RoleService {
    public List<Role> selectRoleList() throws Exception;
}
