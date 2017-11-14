package test;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

import com.sun.net.ssl.HttpsURLConnection;



public class PingTest {
	public static void main(String[] args) {
        try {
            //声明并得到本地InetAddress对象
            InetAddress iAddress1=InetAddress.getLocalHost();
            //声明并得到远程InetAddress对象
            InetAddress iAddress2=InetAddress.getByName("www.baidu.com");
            //获得本地IP地址
            System.out.println("本机IP地址为："+iAddress1.getHostAddress());
            //获得远程IP地址
            System.out.println("百度的IP地址是："+iAddress2.getHostAddress());
            System.out.println("本机是否可达："+iAddress2.isReachable(3000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
