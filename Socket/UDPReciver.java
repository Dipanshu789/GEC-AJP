import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReciver{
    public static void main(String[] args) {
        try {
            DatagramSocket s = new DatagramSocket(9876);
            byte[] buffer = new byte[1024];
            DatagramPacket pk = new DatagramPacket(buffer, buffer.length);
            System.out.println("Waiting fro a messaage");
            s.receive(pk);
            String rev = new String(pk.getData(),0,pk.getLength());
            System.out.println("msg recived"+rev);
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
