package by.epamtc.komarov.client_server;

import by.epamtc.komarov.client_server.bean.Component;
import by.epamtc.komarov.client_server.bean.impl.Text;
import by.epamtc.komarov.client_server.dao.ReadFile;
import by.epamtc.komarov.client_server.dao.impl.ReadFileImpl;
import by.epamtc.komarov.client_server.dao.parser.ComponentParser;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class Client {
    private static Socket clientSocket;
    private static ObjectOutputStream moveToServer;
    private static ObjectInputStream getFromServer;

    public static void main(String[] args) {

        ReadFile reader = new ReadFileImpl();
        ComponentParser componentParser = new ComponentParser();

        Text text = componentParser.createText(reader.read());

        try {
            try {

                clientSocket = new Socket("localhost", 4004);

                //Sending object to Server
                moveToServer = new ObjectOutputStream(clientSocket.getOutputStream());
                moveToServer.writeObject(text);

                //Taking object from server
                getFromServer = new ObjectInputStream(clientSocket.getInputStream());
                Text text1 = (Text)getFromServer.readObject();
                print(text1.getText());

            } finally {
                clientSocket.close();
                System.out.println("Client was closed");
                moveToServer.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    public static void print(List<? extends Component> components) {
        StringBuilder sb = new StringBuilder();

        for (Component component : components) {
            sb.append(component.getComponent()).append("\n");
        }

        System.out.println(sb.toString());
    }
}

