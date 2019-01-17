package com.dsj.wms.controller.infoController;

import com.dsj.wms.entity.Staff;
import com.dsj.wms.service.infoService.StaffService;
import com.dsj.wms.utils.PageInfo;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/staff")
public class StaffController {
    @Resource
    private StaffService staffService;

    @RequestMapping(value = "/staffList")
    /*@ResponseBody*/ public String selectStaffList(Model model, String staCode, String staName, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum, @RequestParam(defaultValue = "4", value = "pageSize") Integer pageSize) throws Exception {
        //引入分页查询，使用PageHelper分页功能在查询之前传入当前页，然后多少记录
        PageHelper.startPage(pageNum, pageSize);
        //startPage后紧跟的这个查询就是分页查询
        List<Staff> staffList = staffService.getStaffList(staCode, staName, pageNum, pageSize);
        //使用PageInfo包装查询结果，只需要将pageInfo交给页面就可以
        PageInfo<Staff> pageInfo = new PageInfo<>(staffList);
        model.addAttribute("pageInfo", pageInfo);

        //获得当前页
        model.addAttribute("pageNum", pageInfo.getPageNum());
        //获得一页显示的条数
        model.addAttribute("pageSize", pageInfo.getPageSize());
        //是否是第一页
        model.addAttribute("isFirstPage", pageInfo.isIsFirstPage());
        //获得总页数
        model.addAttribute("totalPages", pageInfo.getPages());
        //是否是最后一页
        model.addAttribute("isLastPage", pageInfo.isIsLastPage());

        return "staffList";
    }


    //职员编辑
    @RequestMapping(value = "/staffModify")
    public String modifyStaff(@RequestParam Integer id, Model model) {
        try {
            Staff staff = staffService.selectStaffById(id);
            if (staff != null) {
                model.addAttribute("staff", staff);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "staffModify";
    }

    //保存编辑后的职员信息
    @Transactional
    @RequestMapping(value = "/staffSave",method = RequestMethod.POST)
    public String staffSave(Staff staff) {
        boolean flag = false;
        try {
            flag = staffService.modifyStaffById(staff);
            if (flag == true) {
                return "redirect:/staff/staffList";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "staffModify";
    }

    //职员详情
    @RequestMapping(value = "/staffDetails")
    public String showStaffDetail() {
        return "staffDetails";
    }
}
