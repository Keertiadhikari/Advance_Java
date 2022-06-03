import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPServer{
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket ds = new DatagramSocket(3456);
        byte b[] = new byte[2000];
        DatagramPacket dp = new DatagramPacket(b, b.length);
        ds.receive(dp);
        String sentence = new String(dp.getData());
       // int len_sen = dp.getLength();
       int count = 0;
       for(int i =0;i<dp.getLength();i++)
       {
	if(sentence.charAt(i) != ' ')
	{
		count++;
	}
       }
        System.out.println(count);

        InetAddress ia = InetAddress.getLocalHost();
        String sen_len = "" + count;
        byte b1[] = sen_len.getBytes();
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length, ia, dp.getPort());
        ds.send(dp1);
        ds.close();
    }
}