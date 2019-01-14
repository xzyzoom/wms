package com.dsj.wms.serviceimpl.asnServiceImpl;

import com.dsj.wms.entity.asn;
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
    public List<asn> getasnList() {
        return  asnMapper.getasnList();
    }
}
