package test;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import org.apache.struts2.ServletActionContext;
import dao.IpstateDao;

public class TestAction {
	public String execute() throws Exception{
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		PrintWriter out=response.getWriter();
		IpstateDao dao=new IpstateDao();
		JSONArray jx3=new JSONArray();
		jx3=dao.getJSON("½£Íø3");
		out.println(jx3);
		return null;
	}
}
