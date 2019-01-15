package com.dsj.wms.dao.assetDao;

import com.dsj.wms.entity.AssetManagementEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * 资产管理
 * author
 */
@Mapper
public interface AssetMapper {

    //资产验收(添加)

    public boolean addAsset(AssetManagementEntity assetManagementEntity) throws Exception;

    //资产管理（1、借出、2、归还、3、维修、4、变更、保养、盘点）查询所有在对用的资产更改其状态

    public List<AssetManagementEntity> getAssetManagementList() throws Exception;

    //1、借出（经手人，借出时间，借出数量，借出部门）
    public boolean loanedAsset(AssetManagementEntity assetManagementEntity)throws Exception;

    //通过ID查询资产详细信息
    public AssetManagementEntity getAssetById(Integer id) throws Exception;
    //资产报废（物理删除数据）

}
