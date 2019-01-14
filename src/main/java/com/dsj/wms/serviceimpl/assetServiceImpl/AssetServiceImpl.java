package com.dsj.wms.serviceimpl.assetServiceImpl;

import com.dsj.wms.dao.assetDao.AssetMapper;
import com.dsj.wms.entity.AssetManagementEntity;
import com.dsj.wms.service.assetService.AssetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {
    @Resource
    private AssetMapper assetMapper;

    @Override
    public boolean addAsset(AssetManagementEntity assetManagementEntity) throws Exception {
        return assetMapper.addAsset(assetManagementEntity);
    }

    @Override
    public List<AssetManagementEntity> getAssetManagementLists() throws Exception {
        return assetMapper.getAssetManagementList();
    }

    @Override
    public int getAssets() {
        return assetMapper.getAssetCount();
    }

    @Override
    public AssetManagementEntity getAssetById(Integer id) throws Exception {
        return assetMapper.getAssetById(id);
    }


}
