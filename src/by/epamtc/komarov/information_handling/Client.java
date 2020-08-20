package by.epamtc.komarov.information_handling;

import by.epamtc.komarov.information_handling.bean.Component;
import by.epamtc.komarov.information_handling.bean.impl.CodeBlock;
import by.epamtc.komarov.information_handling.dao.ReadFile;
import by.epamtc.komarov.information_handling.dao.impl.ReadFileImpl;
import by.epamtc.komarov.information_handling.dao.parser.CodeBlockParser;
import by.epamtc.komarov.information_handling.service.Create;

import java.io.*;
import java.net.Socket;

public class Client {
    private static Socket clientSocket;
    private static ObjectOutputStream moveToServer;
    private static ObjectInputStream getFromServer;

    public static void main(String[] args) {

        ReadFile file = new ReadFileImpl();
        Component outputCodeBlock = new CodeBlockParser().codeBlock(file.read());

        try {
            try {

                clientSocket = new Socket("localhost", 4004);

   /////////////// This example use object Code Block, rewrite with Text ////////////////
                //Sending object to Server
                moveToServer = new ObjectOutputStream(clientSocket.getOutputStream());
                moveToServer.writeObject(outputCodeBlock);

                //Taking object from server
                getFromServer = new ObjectInputStream(clientSocket.getInputStream());
                Component codeBlock = (CodeBlock)getFromServer.readObject();
                System.out.println(codeBlock);

            } finally {
                clientSocket.close();
                System.out.println("Client was closed");
                moveToServer.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
    }
}

