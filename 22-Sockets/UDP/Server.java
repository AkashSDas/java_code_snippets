package Practicals.Practical10.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(8000);

            // receiving data
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            String dataStr = new String(packet.getData());

            // sending data
            int intData = Integer.parseInt(dataStr.trim());
            int dataToSend = intData * intData;
            byte[] dataBytes = (dataToSend + "").getBytes();
            InetAddress address = InetAddress.getLocalHost();
            DatagramPacket sendPacket = new DatagramPacket(dataBytes, dataBytes.length, address, packet.getPort());
            socket.send(sendPacket);
        } catch (Exception e) {
            System.out.printf("❌ We got some error\n%s", e);
        }
    }
}
