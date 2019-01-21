package com.dsj.wms.service.infoService;

import com.dsj.wms.entity.DepartmentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepService {
    /**
     * 查询部门
     */
    public List<DepartmentEntity> getDepList() throws  Exception;
}
