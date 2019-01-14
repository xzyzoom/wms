package com.dsj.wms.service.assetService;

import com.dsj.wms.entity.AssetManagementEntity;

import java.util.List;

public interface AssetService {
    //模具验收
    public boolean addAsset(AssetManagementEntity assetManagementEntity) throws Exception;

    //资产管理（借出、归还、维修、变更、保养、盘点）查询所有在对用的资产更改其状态
    public List<AssetManagementEntity> getAssetManagementLists() throws Exception;

    //查询资产记录数
    public int getAssets();

    //通过ID查询资产详细信息
    public AssetManagementEntity getAssetById(Integer id) throws Exception;
}
