package Practicals.Practical10.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();

            // for sending data
            int data = 12;
            byte[] dataBytes = String.valueOf(data).getBytes();
            InetAddress address = InetAddress.getLocalHost();
            DatagramPacket packet = new DatagramPacket(dataBytes, dataBytes.length, address, 8000);
            socket.send(packet);

            // for accepting data
            byte[] receivedData = new byte[1024];
            DatagramPacket packetReceived = new DatagramPacket(receivedData, receivedData.length);
            socket.receive(packetReceived);

            String dataReceived = new String(packetReceived.getData());
            System.out.println("🍕 Result: " + dataReceived);

        } catch (Exception e) {

        }
    }

}
