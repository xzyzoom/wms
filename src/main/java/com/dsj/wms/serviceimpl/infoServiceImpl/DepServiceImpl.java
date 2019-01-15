package com.dsj.wms.serviceimpl.infoServiceImpl;

import com.dsj.wms.dao.infoDao.DepMapper;
import com.dsj.wms.entity.DepartmentEntity;
import com.dsj.wms.service.infoService.DepService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DepServiceImpl implements DepService {
@Resource
private DepMapper depMapper;

    public List<DepartmentEntity> getDepList()throws Exception {
        return depMapper.getDepList();
    }
}
