package com.dsj.wms.dao.asnDao;


import com.dsj.wms.entity.asnmain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface asnMapper {
   public List<asnmain> getasnList();
   /* public int addasn(asn asn);*/

   public asnmain getasnbyid(@Param("id") int id);
   public int insertasn(asnmain asnmain);
   public int updateasn(asnmain asnmain);
   public int deleteasn(@Param("id") int id);
}
