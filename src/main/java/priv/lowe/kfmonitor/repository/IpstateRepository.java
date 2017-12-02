package priv.lowe.kfmonitor.repository;


import priv.lowe.kfmonitor.entity.Ipstate;

import java.util.List;

public interface IpstateRepository {

    public Ipstate getById(int id);

    public List getAllByGname(String gname);

    public void save(Ipstate ipstate);

    public void update(Ipstate ipstate);

    public void saveOrUpdate(Ipstate ipstate);

    public void updateStateByGname(String gname);

}
