package Practicals.Practical10.TCP;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    // initialize socket & input output stream
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream input = null;

    public Server(int port) {
        // start server & wait for connections
        try {
            // initializing the server
            server = new ServerSocket(port);
            System.out.println("💃 Server has started");

            // accepting connections
            socket = server.accept();
            System.out.println("👀 Someone has joined");

            // take input from client stream
            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String message = "";

            while (!message.equals("Exit Chat")) {
                try {
                    message = input.readUTF();
                    System.out.printf("> %s\n", message);
                } catch (Exception e) {
                    System.out.printf("❌ Some error has occured\n%s", e);
                }
            }
            System.out.println("👋 Closing connections");
        } catch (Exception e) {
            System.out.printf("❌ Some error has occured\n%s", e);
        }
    }

    public static void main(String[] args) {
        Server server = new Server(8000);
    }
}
