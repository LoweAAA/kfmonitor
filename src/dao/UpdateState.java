package dao;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.List;
import po.Ipstate;
import idao.IUpdateState;
import dao.IpstateDao;

public class UpdateState implements IUpdateState {

	@Override
	public void updateState(String gname) {
		// TODO Auto-generated method stub
		IpstateDao ipstateDao=new IpstateDao();
		List list=ipstateDao.getIpstatesByGname(gname);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			Ipstate ipstate=(Ipstate)list.get(i);
			String ip=ipstate.getIp();
			int port=ipstate.getPort();
			try {
				Socket socket=new Socket();
				SocketAddress address = new InetSocketAddress(ip,port);
				socket.connect(address, 1000);
				ipstate.setState(1);
				ipstateDao.setStateByIpstate(ipstate);
				System.out.println("success");
			} catch (Exception e) {
				// TODO: handle exception
				ipstate.setState(0);
				ipstateDao.setStateByIpstate(ipstate);
				System.out.println("error");
			}
		}
	}

}
