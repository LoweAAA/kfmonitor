package test;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import po.Ipstate;
import net.sf.json.JSONArray;
import test.TestAction;
import dao.IpstateDao;
import dao.UpdateState;

public class TestMain {
	public static void main(String[] args) throws SQLException {
		Session session=util.HibernateSessionFactory.getSession();
		Ipstate ips=(Ipstate)session.get(Ipstate.class, 2);
		System.out.println(ips.getPort());
		System.out.println(ips.getZserver());
	}
}
