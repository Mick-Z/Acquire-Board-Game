package server;

import control.ChatRoom;
import control.ChatService;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Name: Mick Zeller
 */
public class AcquireServer
{

    public static void main(String[] args) throws IOException
    {
        final int ROOM_SIZE = 4;
        ChatRoom chatRoom = new ChatRoom(ROOM_SIZE);
        final int PORT = 8888;
        ServerSocket server = new ServerSocket(PORT);

        System.out.println("waiting for players to connect....");
        Socket socket;
        while (true)
        {
            socket = server.accept();
            ChatService service = new ChatService(socket, chatRoom);
            Thread thread = new Thread(service);
            thread.start();
        }
    }

}
