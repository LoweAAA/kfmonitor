package test;
import java.util.List;
import po.Ipstate;
import net.sf.json.JSONArray;
import test.TestAction;
import dao.IpstateDao;
import dao.UpdateState;

public class TestMain {
	public static void main(String[] args) {
		/*IpstateDao dao=new IpstateDao();
		List jxGzone= dao.getGzoneByGname("½£Íø3");
		for(int i=0;i<jxGzone.size();i++){
			String gzone=(String)jxGzone.get(i);
			System.out.println(gzone);
		}
		List list=dao.getIpstatesByGname("½£Íø3");
		for(int i=0;i<list.size();i++){
			Ipstate ipstate=(Ipstate)list.get(i);
			System.out.println(ipstate.getZserver());
		}
		*/
		UpdateState updateState=new UpdateState();
		updateState.updateState("½£Íø3");
	}
}
