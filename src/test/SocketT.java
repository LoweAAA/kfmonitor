package test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;



public class SocketT {
	public static void main(String[] args) throws UnknownHostException, IOException {
		try {
		Socket socket=new Socket();
		SocketAddress address = new InetSocketAddress("120.92.176.160",3724);
		socket.connect(address, 1000);
			System.out.println("success");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
		
	}
}
