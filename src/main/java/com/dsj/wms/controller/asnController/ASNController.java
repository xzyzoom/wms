package com.dsj.wms.controller.asnController;

import com.dsj.wms.service.asnService.ASNService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/material")
public class ASNController {
    @Resource
    private ASNService asnService;
    @RequestMapping(value = "/getmaterial.html")
    public String getmaterial() {
        return "1";
    }

}
