package test;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

import com.sun.net.ssl.HttpsURLConnection;



public class PingTest {
	public static void main(String[] args) {
        try {
            //�������õ�����InetAddress����
            InetAddress iAddress1=InetAddress.getLocalHost();
            //�������õ�Զ��InetAddress����
            InetAddress iAddress2=InetAddress.getByName("www.baidu.com");
            //��ñ���IP��ַ
            System.out.println("����IP��ַΪ��"+iAddress1.getHostAddress());
            //���Զ��IP��ַ
            System.out.println("�ٶȵ�IP��ַ�ǣ�"+iAddress2.getHostAddress());
            System.out.println("�����Ƿ�ɴ"+iAddress2.isReachable(3000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
