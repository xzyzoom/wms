package com.dsj.wms.dao.infoDao;

import com.dsj.wms.entity.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StaffMapper {

    public List<Staff> getStaffList(@Param("staCode") String staCode, @Param("staName") String staName) throws Exception;
}
