package by.epamtc.komarov.information_handling;

import by.epamtc.komarov.information_handling.bean.CodeBlock;
import by.epamtc.komarov.information_handling.bean.Component;
import by.epamtc.komarov.information_handling.dao.ReadFile;
import by.epamtc.komarov.information_handling.dao.ReadFileImpl;
import by.epamtc.komarov.information_handling.model.Create;

import java.io.*;
import java.net.Socket;

public class Client {
    private static Socket clientSocket;
    private static ObjectOutputStream oos;

    public static void main(String[] args) {

        ReadFile readFile = new ReadFileImpl();
        String text = String.valueOf(readFile.
                readToStringBuilder("src/by/epamtc/komarov/information_handling/resources/text.txt"));

        Component outputCodeBlock = new Create().codeBlock(text);
        Component outputWord = new Create().word(text);

        try {
            try {

                clientSocket = new Socket("localhost", 4004);

                oos = new ObjectOutputStream(clientSocket.getOutputStream());
                oos.writeObject(outputCodeBlock);
                oos.writeObject(outputWord);

            } finally {
                clientSocket.close();
                System.out.println("Client was closed");
                oos.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

