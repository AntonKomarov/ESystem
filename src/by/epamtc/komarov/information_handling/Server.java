package by.epamtc.komarov.information_handling;

import by.epamtc.komarov.information_handling.bean.CodeBlock;
import by.epamtc.komarov.information_handling.bean.Component;
import by.epamtc.komarov.information_handling.bean.Word;

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

                 try {

                     ois = new ObjectInputStream(clientSocket.getInputStream());

                     Component codeBlock = (CodeBlock)ois.readObject();
                     System.out.println("CodeBlock from Server:\n" + codeBlock);

                     Component word = (Word)ois.readObject();
                     System.out.println(word);


                 } finally {
                    clientSocket.close();
                    ois.close();
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
