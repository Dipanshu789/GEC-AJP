import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
      
 public static void main(String[] args){
    try{
 DatagramSocket s = new DatagramSocket();
 String msg = "Hello UDP reciver";
    byte[] buffer = msg.getBytes();
    InetAddress ad = InetAddress.getByName("localhost");
    int port = 9876;
    DatagramPacket pk = new DatagramPacket(buffer, buffer.length, ad, port);
    s.send(pk);
    s.close();}
    catch(Exception e){
        System.out.println("e");
    }
}}