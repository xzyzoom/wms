package com.dsj.wms.controller.asnController;

import com.dsj.wms.entity.Staff;
import com.dsj.wms.entity.asnmain;
import com.dsj.wms.service.asnService.ASNService;
import com.dsj.wms.utils.PageInfo;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping(value = "/material")
public class ASNController {
    @Resource
    private ASNService asnService;
    @RequestMapping(value = "/getmaterial.html")

    public String getmaterial(Model model,@RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum,
                             @RequestParam(defaultValue = "4", value = "pageSize") Integer pageSize) {
        //引入分页查询，使用PageHelper分页功能在查询之前传入当前页，然后多少记录
        PageHelper.startPage(pageNum, pageSize);
        List<asnmain> list=asnService.getasnList(pageNum,pageSize);
        PageInfo<asnmain> pageInfo = new PageInfo<>(list);

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


        model.addAttribute("list",list);

        return "asn";
    }


    @RequestMapping(value = "/selectASN.html")

    public ModelAndView selectASN() {

        ModelAndView model=new ModelAndView();

        model.setViewName("asnmain");
        return model;
    }
    @RequestMapping(value = "/insertASN.html")

    public ModelAndView insertASN() {

        ModelAndView model=new ModelAndView();

        model.setViewName("asnInsert");
        return model;
    }
    @RequestMapping(value = "/selectASNbyId.html")
    public ModelAndView selectASNbyId(@RequestParam(value="id")String id) {
System.out.println("id==========="+id);
        ModelAndView model=new ModelAndView();

asnmain a=asnService.getasnbyId(Integer.parseInt(id));
        model.addObject("asn",a);
        model.setViewName("asnmain");
        return model;
    }
    @RequestMapping(value = "/saveASNinsert.html")
    public ModelAndView insertASN(@RequestParam(value="documentNo")String documentNo,@RequestParam(value="createTime")String createTime,
                                  @RequestParam(value="deliveryTime")String deliveryTime, @RequestParam(value="arrivalTime")String arrivalTime,
                                  @RequestParam(value="supId")String supId, @RequestParam(value="depId")String depId,
                                  @RequestParam(value="staId")String staId ,  @RequestParam(value="transportType")String transportType,
                                  @RequestParam(value="arrivalAddress")String arrivalAddress ,  @RequestParam(value="remarks")String remarks ,
                                  @RequestParam(value="inventoryCode")String inventoryCode ,@RequestParam(value="inventoryName")String inventoryName ,
                                  @RequestParam(value="specificationType")String specificationType ,@RequestParam(value="unit")String unit ,
                                  @RequestParam(value="orderQuantity")String orderQuantity ,@RequestParam(value="arriveNum")String arriveNum ,
                                  @RequestParam(value="unArriveNum")String unArriveNum ,@RequestParam(value="waitSendNum")String waitSendNum ,
                                  @RequestParam(value="packgingNum")String packgingNum) throws ParseException {
System.out.println(documentNo+createTime+deliveryTime+arrivalTime+supId+depId+staId+transportType+arrivalAddress+remarks+inventoryCode+inventoryName
+specificationType+unit+orderQuantity+arriveNum+unArriveNum+waitSendNum+packgingNum);
        ModelAndView model=new ModelAndView();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

     int i= asnService.insertasn(new asnmain(documentNo, sdf.parse(createTime),sdf.parse(deliveryTime),sdf.parse(arrivalTime),Integer.parseInt(supId),
              Integer.parseInt(depId),Integer.parseInt(staId),transportType,arrivalAddress,remarks,inventoryCode,inventoryName
              ,specificationType,unit,Integer.parseInt(orderQuantity),Integer.parseInt(arriveNum),Integer.parseInt(unArriveNum),
              Integer.parseInt(waitSendNum),Integer.parseInt(packgingNum)));
if (i>0){
    System.out.println("新增成功");
}else{
    System.out.println("新增失败");
}
        model.setViewName("redirect:/material/getmaterial.html");
        return model;
    }
    @RequestMapping(value = "/ASNupdate.html")
    public ModelAndView updateASN(@RequestParam(value="id")String id) {
        System.out.println("id==========="+id);
        ModelAndView model=new ModelAndView();

        asnmain a=asnService.getasnbyId(Integer.parseInt(id));
        model.addObject("asn",a);
        model.setViewName("asnUpdate");
        return model;
    }
    /*saveASNupdate.html*/
    @RequestMapping(value = "/saveASNupdate.html")
    public ModelAndView saveUpdateASN(@RequestParam(value="id")String id,
                                      @RequestParam(value="documentNo")String documentNo,@RequestParam(value="createTime")String createTime,
                                      @RequestParam(value="deliveryTime")String deliveryTime, @RequestParam(value="arrivalTime")String arrivalTime,
                                      @RequestParam(value="supId")String supId, @RequestParam(value="depId")String depId,
                                      @RequestParam(value="staId")String staId ,  @RequestParam(value="transportType")String transportType,
                                      @RequestParam(value="arrivalAddress")String arrivalAddress ,  @RequestParam(value="remarks")String remarks ,
                                      @RequestParam(value="inventoryCode")String inventoryCode ,@RequestParam(value="inventoryName")String inventoryName ,
                                      @RequestParam(value="specificationType")String specificationType ,@RequestParam(value="unit")String unit ,
                                      @RequestParam(value="orderQuantity")String orderQuantity ,@RequestParam(value="arriveNum")String arriveNum ,
                                      @RequestParam(value="unArriveNum")String unArriveNum ,@RequestParam(value="waitSendNum")String waitSendNum ,
                                      @RequestParam(value="packgingNum")String packgingNum)throws ParseException {

        ModelAndView model=new ModelAndView();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       int i= asnService.updateasn(new asnmain(Integer.parseInt(id),documentNo, sdf.parse(createTime),sdf.parse(deliveryTime),sdf.parse(arrivalTime),Integer.parseInt(supId),
                Integer.parseInt(depId),Integer.parseInt(staId),transportType,arrivalAddress,remarks,inventoryCode,inventoryName
                ,specificationType,unit,Integer.parseInt(orderQuantity),Integer.parseInt(arriveNum),Integer.parseInt(unArriveNum),
                Integer.parseInt(waitSendNum),Integer.parseInt(packgingNum)));
        if (i>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }

        model.setViewName("redirect:/material/getmaterial.html");

        return model;
    }
    @RequestMapping(value = "/ASNdelete.html")
    public ModelAndView deleteASN(@RequestParam(value="id")String id) {
        System.out.println("id==========="+id);
        ModelAndView model=new ModelAndView();

        int i=asnService.deleteasn(Integer.parseInt(id));
        if (i>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }

        model.setViewName("redirect:/material/getmaterial.html");
        return model;
    }
}
