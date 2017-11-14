package test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;



public class SocketT {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket();
		SocketAddress endpoint=new InetSocketAddress("www.baidu是发发是否是.com", 80);
		socket.connect(endpoint, 1000);
	}
}
