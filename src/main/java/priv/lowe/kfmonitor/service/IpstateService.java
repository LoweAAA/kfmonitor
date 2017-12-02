package priv.lowe.kfmonitor.service;

import java.util.List;

public interface IpstateService {

    public List getGzoneZserverStateListByGname(String gname);

    public void updateState();
}
