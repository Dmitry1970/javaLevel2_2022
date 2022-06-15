package ru.gb.baranov.homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        // try-with-resources
        try (ServerSocket serverSocket = new ServerSocket(8189)){
            System.out.println("Ждём подключения клиента...");
            final Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            final DataInputStream in = new DataInputStream(socket.getInputStream());
            final DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            new Thread (() -> {
                try {
                    while(true) {
                        final String message = in.readUTF();
                        if("/end".equalsIgnoreCase(message)) {
                            break;
                        }
                        System.out.println("Сообщение от клиента: " + message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            while (true)  {    // poison pill
                final String message = in.readUTF();
                if("/end".equalsIgnoreCase(message)) {
                    out.writeUTF("/end");
                    break;
                }
                System.out.println("Сообщение от клиента: " + message);
                out.writeUTF("[echo] " + message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
