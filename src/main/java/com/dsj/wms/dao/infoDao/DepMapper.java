package com.dsj.wms.dao.infoDao;

import com.dsj.wms.entity.DepartmentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DepMapper {
    /**
     * 查询部门
     */
    public List<DepartmentEntity> getDepList() throws  Exception;
}
