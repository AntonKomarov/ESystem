package by.epamtc.komarov.information_handling;

import by.epamtc.komarov.information_handling.bean.impl.CodeBlock;
import by.epamtc.komarov.information_handling.bean.Component;

import java.io.*;
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

                     getFromClient = new ObjectInputStream(clientSocket.getInputStream());

                     Component codeBlock = (CodeBlock) getFromClient.readObject();
                     System.out.println("CodeBlock from Server is accepted\n");

                     moveToClient = new ObjectOutputStream(clientSocket.getOutputStream());
                     moveToClient.writeObject(codeBlock);
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
