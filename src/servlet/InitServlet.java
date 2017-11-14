package servlet;
import java.util.Timer;

import javax.servlet.http.HttpServlet;
import timer.UpdateTask;
import dao.UpdateState;

public class InitServlet extends HttpServlet{
	public InitServlet() throws InterruptedException{
		UpdateState updateState=new UpdateState();
		Timer timer=new Timer();
		timer.schedule(new UpdateTask(), 1000,1000*60);
	}
}
