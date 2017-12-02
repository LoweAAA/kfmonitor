package priv.lowe.kfmonitor.util.timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import priv.lowe.kfmonitor.repository.IpstateRepository;

import java.util.TimerTask;

@Component
public class UpdateStateTask extends TimerTask{
    @Autowired
    private IpstateRepository ipstateRepository;
    private String gname="剑网3";
    public void run() {
        ipstateRepository.updateStateByGname(gname);
    }
}
