package timer;

import java.util.TimerTask;
import dao.UpdateState;

public class UpdateTask extends TimerTask {
	private String gname;
	public UpdateTask(String gname){
		this.gname=gname;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		UpdateState updateState=new UpdateState();
		updateState.updateState(gname);
	}
	
}
