package com.dsj.wms.serviceimpl.infoServiceImpl;

import com.dsj.wms.dao.infoDao.StaffMapper;
import com.dsj.wms.entity.Staff;
import com.dsj.wms.service.infoService.StaffService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StaffServiceImpl implements StaffService {
    @Resource
    private StaffMapper staffMapper;


    @Override
    public List<Staff> getStaffList(String staCode, String staName, Integer pageNum, Integer pageSize) throws Exception {
        //使用插件进行分页
        PageHelper.startPage(pageNum,pageSize);
        return staffMapper.getStaffList(staCode,staName);
    }
}
