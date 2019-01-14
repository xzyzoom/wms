package com.dsj.wms.controller.infoController;

import com.dsj.wms.entity.Staff;
import com.dsj.wms.service.infoService.StaffService;
import com.dsj.wms.utils.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/staff")
public class StaffController {
    @Resource
    private StaffService staffService;

    @RequestMapping(value = "/staffList")
    public List<Staff> selectStaffList(String staCode,String staName,@RequestParam(defaultValue = "1", value = "currentPage") Integer pageNum, @RequestParam(defaultValue = "5", value = "pageSize") Integer pageSize) {
        List<Staff> staffList = null;
        try {
            staffList = staffService.getStaffList(staCode,staName,pageNum, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return staffList;
    }
}
