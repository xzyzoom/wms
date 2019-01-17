package com.dsj.wms.service.infoService;

import com.dsj.wms.entity.Staff;

import java.util.List;

public interface StaffService {

    public List<Staff> getStaffList(String staCode, String staName, Integer pageNum, Integer pageSize) throws Exception;

    public Staff selectStaffById(Integer id) throws Exception;

    public boolean modifyStaffById(Staff staff) throws Exception;
}
