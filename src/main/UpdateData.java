package main;
import dao.UpdateState;
public class UpdateData {
	public static void main(String[] args) throws InterruptedException {
		UpdateState updateState=new UpdateState();
		while(true){
			updateState.updateState("½£Íø3");
			Thread.sleep(3000);
		}
	}
}
