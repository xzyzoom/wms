package com.dsj.wms.dao.userDao;

import com.dsj.wms.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    public List<Role> getRoleList();
}
