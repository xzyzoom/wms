package com.dsj.wms.serviceimpl.asnServiceImpl;

import com.dsj.wms.entity.asnmain;
import com.dsj.wms.service.asnService.ASNService;
import org.springframework.stereotype.Service;
import com.dsj.wms.dao.asnDao.asnMapper;
import javax.annotation.Resource;
import java.util.List;
@Service
public class asnServiceimpl implements ASNService {
    @Resource
private asnMapper asnMapper;
    @Override
    public List<asnmain> getasnList(Integer pageNum, Integer pageSize) {
        return  asnMapper.getasnList();
    }

    @Override
    public asnmain getasnbyId(int id) {
        return asnMapper.getasnbyid(id);
    }

    @Override
    public int insertasn(asnmain asnmain) {
        return asnMapper.insertasn(asnmain);
    }

    @Override
    public int updateasn(asnmain asnmain) {
        return asnMapper.updateasn(asnmain);
    }

    @Override
    public int deleteasn(int id) {
        return asnMapper.deleteasn(id);
    }
}
