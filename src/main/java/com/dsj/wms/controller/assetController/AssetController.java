package com.dsj.wms.controller.assetController;

import com.dsj.wms.entity.AssetManagementEntity;
import com.dsj.wms.entity.DepartmentEntity;
import com.dsj.wms.service.assetService.AssetService;
import com.dsj.wms.service.infoService.DepService;
import com.dsj.wms.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/assets")
public class AssetController {
    /**
     * 资产验收
     *
     * @return
     */
    @Resource
    private AssetService assetService;
    @Resource
    private DepService depService;
    @RequestMapping(value = "/acceptance")
    public String assetManagement() {

        return "acceptance";
    }

    //资产列表
    @RequestMapping(value = "/assetList")
    public String assetList() {

        return "assetList";
    }

    //资产验收
    @RequestMapping(value = "/addAsset")
    public String addAsset(AssetManagementEntity assetManagementEntity, Model model) {
        try {
            boolean flag = assetService.addAsset(assetManagementEntity);
            if (flag) {
                model.addAttribute("message", "验收成功！！！");
            } else {
                model.addAttribute("message", "验收失败！！！");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/assets/getAssetList";
    }

    //资产管理（借出、归还、维修、变更、保养、盘点）查询所有在对用的资产更改其状态
    @RequestMapping(value = "/getAssetList")
    public String getAssetList(Model model){
        List<AssetManagementEntity> assetList = null;
        try {
            assetList = assetService.getAssetManagementLists();
            System.out.println(assetList.size());
            model.addAttribute("assetList", assetList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("assetList.............................");
        return "assetList";
    }

    //通过ID查询资产详细信息
    /*@RequestMapping(value = "/getAssetInfo")
    public String getAssetById(Integer id, Model model) {
        try {
            AssetManagementEntity assetManagementEntity = assetService.getAssetById(id);
            System.out.println(assetManagementEntity.getNameOfMoldTooling());
            model.addAttribute("assetInfo", assetManagementEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "assetInfo";
    }*/
    //通过ID查询资产详细信息
@RequestMapping(value = "/getAssetInfo")
    public String getAssetById(Integer id, Model model) {
    AssetManagementEntity assetManagementEntity = null;
    List<DepartmentEntity> depList = null;
    try {
            depList = depService.getDepList();
            model.addAttribute("depList", depList);
            assetManagementEntity = assetService.getAssetById(id);
            model.addAttribute("assetInfo", assetManagementEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "assetInfo";
    }
    //执行借出（修改字段）
    @RequestMapping(value = "/loaned")
    public String loanedAsset(AssetManagementEntity assetManagementEntity, Model model) {
        System.out.println("****借出****");
        boolean falg;
        try {
            falg = assetService.loanedAsset(assetManagementEntity);
            if (falg) {
                System.out.println("****借出成功****");
                return "redirect:/assets/getAssetList";
            }
        } catch (Exception e) {
            System.out.println("借出失败");
            e.printStackTrace();
        }
        return "redirect:/assets/getAssetInfo";
    }
}
