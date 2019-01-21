package com.dsj.wms.dao.infoDao;

import com.dsj.wms.entity.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StaffMapper {

    public List<Staff> getStaffList(@Param("staCode") String staCode, @Param("staName") String staName) throws Exception;

    public Staff getStaffById(@Param("id") Integer id) throws Exception;

    public int modifyStaffById(Staff staff) throws Exception;

    public int addStaff(Staff staff) throws Exception;

    public int delStaffById(@Param("id") Integer id) throws Exception;
}
