package com.dsj.wms.dao.asnDao;


import com.dsj.wms.entity.asn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface asnMapper {
   public List<asn> getasnList();
   /* public int addasn(asn asn);*/
}
