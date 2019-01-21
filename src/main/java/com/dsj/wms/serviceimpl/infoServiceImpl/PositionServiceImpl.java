package com.dsj.wms.serviceimpl.infoServiceImpl;

import com.dsj.wms.dao.infoDao.PositionMapper;
import com.dsj.wms.entity.JobPosition;
import com.dsj.wms.service.infoService.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Resource
    private PositionMapper positionMapper;

    @Override
    public List<JobPosition> getPositionList() throws Exception {
        return positionMapper.getPositionList();
    }
}
