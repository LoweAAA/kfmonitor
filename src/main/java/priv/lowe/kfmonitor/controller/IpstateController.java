package priv.lowe.kfmonitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.lowe.kfmonitor.entity.Ipstate;
import priv.lowe.kfmonitor.service.IpstateService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IpstateController {

    @Autowired
    private IpstateService ipstateService;

    @RequestMapping("/getstate")
    @ResponseBody
    public List<Ipstate> getState(@RequestParam("gname") String gname){
        return ipstateService.getGzoneZserverStateListByGname(gname);
    }
}
