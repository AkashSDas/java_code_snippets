package Practicals.Practical10.TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    // initialize socket & input output stream
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    public Client(String address, int port) {
        try {
            // establishing connections
            socket = new Socket(address, port);
            System.out.println("🍺 Connections Established");

            // take input from terminal
            input = new DataInputStream(System.in);

            // send output to the socket
            output = new DataOutputStream(socket.getOutputStream());
        } catch (Exception e) {
            System.out.printf("❌ Some error has occured\n%s", e);
        }

        // string to read message from input
        String message = "";
        while (!message.equals("Exit Chat")) {
            try {
                message = input.readLine();
                output.writeUTF(message);
            } catch (Exception e) {
                System.out.printf("❌ Some error has occured\n%s", e);
            }
        }

        // closing connections
        try {
            socket.close();
            input.close();
            output.close();
        } catch (Exception e) {
            System.out.printf("❌ Some error has occured\n%s", e);
        }
    }

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1", 8000);
    }
}
