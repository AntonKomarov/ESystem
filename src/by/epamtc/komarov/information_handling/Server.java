package by.epamtc.komarov.information_handling;

import by.epamtc.komarov.information_handling.bean.CodeBlock;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static ObjectInputStream ois;

    public static void main(String[] args) {

        try{
            try{

                server = new ServerSocket(4004);
                System.out.println("Server is started");
                clientSocket = server.accept();

                 try{

                     ois = new ObjectInputStream(clientSocket.getInputStream());

                     CodeBlock codeBlock = (CodeBlock)ois.readObject();
                     System.out.println("CodeBlock from Server:\n" + codeBlock);

                }  finally {
                    clientSocket.close();
                    ois.close();
                }
            }
            finally{
                System.out.println("Server is closed");
                server.close();
            }
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
