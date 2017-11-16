package servlet;
import java.util.Timer;

import javax.servlet.http.HttpServlet;
import timer.UpdateTask;
import dao.UpdateState;

public class InitServlet extends HttpServlet{
	public InitServlet() throws InterruptedException{
		UpdateState updateState=new UpdateState();
		Timer jx3timer=new Timer();
		jx3timer.schedule(new UpdateTask("½£Íø3"), 1000,1000*60*1);
	}
}
