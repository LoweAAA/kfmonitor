package dao;

import idao.IIpstateDao;
import po.Ipstate;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.hibernate.*;

import java.util.ArrayList;
import java.util.List;

public class IpstateDao implements IIpstateDao{
	public int getState(String gname,String gzone,String zserver){
		Session session=util.HibernateSessionFactory.getSession();
		String hql="from Ipstate where gname=? and gzone=? and zserver=?";
		Query query=session.createQuery(hql);
		query.setString(0, gname);
		query.setString(1, gzone);
		query.setString(2, zserver);
		List list=query.list();
		Ipstate ipstate=(Ipstate)list.get(0);
		session.close();
		return ipstate.getState();	
	}
	public Ipstate getIpstateById(int idipstate){
		Session session=util.HibernateSessionFactory.getSession();
		Ipstate ips=(Ipstate)session.get(Ipstate.class, idipstate);
		util.HibernateSessionFactory.closeSession();
		session.close();
		return ips;
	}
	public List getGzoneByGname(String gname){
		Session session=util.HibernateSessionFactory.getSession();
		String hql="select distinct gzone from Ipstate where gname=?";
		Query query=session.createQuery(hql);
		query.setString(0, gname);
		List list= query.list();
		session.close();
		return list;
	}
	public List getZserverByGnameGzone(String gname,String gzone){
		Session session=util.HibernateSessionFactory.getSession();
		String hql="select zserver from Ipstate where gname=? and gzone=?";
		Query query=session.createQuery(hql);
		query.setString(0, gname);
		query.setString(1, gzone);
		List list=query.list();
		session.close();
		return list;
	}
	public JSONArray getJSON(String gname){
		Session session=util.HibernateSessionFactory.getSession();
		String hql="select gzone,zserver,state from Ipstate where gname=?";
		Query query=session.createQuery(hql);
		query.setString(0, gname);
		List list=query.list();
		JSONObject jsonObject=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<list.size();i++){
			Object[] objects=(Object[])list.get(i);
			jsonObject.put("gzone", objects[0]);
			jsonObject.put("zserver", objects[1]);
			jsonObject.put("state", objects[2]);
			jsonArray.add(jsonObject);
		}
		session.close();
		return jsonArray;
	}
	public List getIpstatesByGname(String gname){
		Session session=util.HibernateSessionFactory.getSession();
		String hql="from Ipstate where gname=?";
		Query query=session.createQuery(hql);
		query.setString(0, gname);
		List list=query.list();
		session.close();
		return list;
	}
	public void setStateByIpstate(Ipstate ipstate){
		Session session=util.HibernateSessionFactory.getSession();
		Transaction transaction=session.beginTransaction();
		session.update(ipstate);
		transaction.commit();
		session.close();
	}
}
