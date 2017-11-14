package po;

public class Ipstate {
	private int idipstate;
	private String ip;
	private int state;
	private String gname;
	private String gzone;
	private String zserver;
	private int port;
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getIdipstate() {
		return idipstate;
	}
	public void setIdipstate(int idipstate) {
		this.idipstate = idipstate;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGzone() {
		return gzone;
	}
	public void setGzone(String gzone) {
		this.gzone = gzone;
	}
	public String getZserver() {
		return zserver;
	}
	public void setZserver(String zserver) {
		this.zserver = zserver;
	}
}
