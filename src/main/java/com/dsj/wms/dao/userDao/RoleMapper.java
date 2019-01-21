package com.dsj.wms.dao.userDao;

import com.dsj.wms.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleMapper {
    public List<Role> getRoleList() throws Exception;

    public Role getRoleById(@Param("id") Integer Id) throws Exception;

    public int addRole(Role role) throws Exception;

    public int updateRoleById(Role role) throws Exception;

    public int delRoleById(@Param("id") Integer id) throws Exception;
}
