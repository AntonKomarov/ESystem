package by.epamtc.komarov.client_server;

import by.epamtc.komarov.client_server.bean.Component;
import by.epamtc.komarov.client_server.bean.impl.Text;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static ObjectOutputStream moveToClient;
    private static ObjectInputStream getFromClient;

    public static void main(String[] args) {

        try{
            try{

                server = new ServerSocket(4004);
                System.out.println("Server is started");
                clientSocket = server.accept();

                 try {

                     // Taking object from Client
                     getFromClient = new ObjectInputStream(clientSocket.getInputStream());
                     Text text = (Text) getFromClient.readObject();
                     System.out.println("CodeBlock from Server is accepted\n");

                     // Sending object to Client
                     moveToClient = new ObjectOutputStream(clientSocket.getOutputStream());
                     moveToClient.writeObject(text);
                     System.out.println("CodeBlock was moved to client");

                 } finally {
                    clientSocket.close();
                    getFromClient.close();
                 }
            }
            finally{
                server.close();
                System.out.println("Server is closed");
            }
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
