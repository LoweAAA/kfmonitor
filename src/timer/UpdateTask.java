package timer;

import java.util.TimerTask;
import dao.UpdateState;

public class UpdateTask extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		UpdateState updateState=new UpdateState();
		updateState.updateState("½£Íø3");
	}
	
}
