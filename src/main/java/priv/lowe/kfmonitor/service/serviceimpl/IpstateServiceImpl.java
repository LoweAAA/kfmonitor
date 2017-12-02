package priv.lowe.kfmonitor.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.lowe.kfmonitor.entity.Ipstate;
import priv.lowe.kfmonitor.repository.IpstateRepository;
import priv.lowe.kfmonitor.service.IpstateService;
import priv.lowe.kfmonitor.util.timer.UpdateStateTask;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class IpstateServiceImpl implements IpstateService{

    @Autowired
    private IpstateRepository ipstateRepository;

    @Autowired
    private UpdateStateTask updateStateTask;

    public List getGzoneZserverStateListByGname(String gname) {
        List ilist=ipstateRepository.getAllByGname(gname);
        List list=new ArrayList();
        for(int i=0;i<ilist.size();i++){
            Map map=new HashMap();
            Ipstate ipstate=(Ipstate)ilist.get(i);
            map.put("gzone",ipstate.getGname());
            map.put("zserver",ipstate.getZserver());
            map.put("state",ipstate.getState());
            list.add(map);
        }
        return list;
    }
    @PostConstruct
    public void updateState(){
        Timer timer=new Timer();
        timer.schedule(updateStateTask,1000,1000*60*1);
    }



}
