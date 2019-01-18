package com.dsj.wms.service.asnService;

import com.dsj.wms.entity.asnmain;

import java.util.List;

public  interface ASNService {
    public List<asnmain> getasnList(Integer pageNum, Integer pageSize);
    public asnmain getasnbyId(int id);
    public int insertasn(asnmain asnmain);
    public int updateasn(asnmain asnmain);
    public int deleteasn(int id);
}
