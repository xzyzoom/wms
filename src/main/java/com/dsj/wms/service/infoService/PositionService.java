package com.dsj.wms.service.infoService;

import com.dsj.wms.entity.JobPosition;

import java.util.List;

public interface PositionService {
    
    public List<JobPosition> getPositionList() throws Exception;
}
