package priv.lowe.kfmonitor.repository.repositoryimpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import priv.lowe.kfmonitor.entity.Ipstate;
import priv.lowe.kfmonitor.repository.IpstateRepository;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.List;

@Repository
public class IpstateRepositoryImpl implements IpstateRepository{

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.openSession();
    }

    public Ipstate getById(int id) {
        return (Ipstate)getSession().get(Ipstate.class,id);
    }

    public List getAllByGname(String gname) {
        Session session=getSession();
        String hql="from Ipstate where gname=?";
        Query query=session.createQuery(hql);
        query.setString(0, gname);
        List list=query.list();
        return list;
    }

    public void save(Ipstate ipstate) {

    }

    public void update(Ipstate ipstate) {
        Session session= getSession();
        Transaction transaction=session.beginTransaction();
        session.update(ipstate);
        transaction.commit();
        session.close();
    }

    public void saveOrUpdate(Ipstate ipstate) {

    }

    public void updateStateByGname(String gname) {
        List list= getAllByGname(gname);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            Ipstate ipstate=(Ipstate)list.get(i);
            String ip=ipstate.getIp();
            int port=ipstate.getPort();
            try {
                Socket socket=new Socket();
                SocketAddress address = new InetSocketAddress(ip,port);
                socket.connect(address, 1000*10);
                ipstate.setState(1);
                update(ipstate);
                System.out.println("success");
            } catch (Exception e) {
                // TODO: handle exception
                ipstate.setState(0);
                update(ipstate);
                System.out.println("error");
            }
        }
    }
}
