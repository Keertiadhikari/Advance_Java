import java.io.IOException;
import java.net.*;
import javax.swing.*;
public class UDPClient{
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket ds = new DatagramSocket();
        String sentence = JOptionPane.showInputDialog("Enter the string");
        System.out.println("String entered on client side : " + sentence);
        byte b[] = sentence.getBytes();
        InetAddress ia = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(b, b.length, ia, 3456);
        ds.send(dp);

        byte b1[] = new byte[2000];
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
        ds.receive(dp1);
        String count = new String(dp1.getData());
        count = count.trim();
        System.out.println(count);
        ds.close() ;
    }
}