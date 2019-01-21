package com.dsj.wms.dao.infoDao;

import com.dsj.wms.entity.JobPosition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PositionMapper {
    public List<JobPosition> getPositionList() throws Exception;
}
