package control;

import view.ChatWindow;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Name: Mick Zeller
 */
public class ChatService implements Runnable
{

    private String username;
    private Socket socket;
    private ChatRoom chatRoom;
    private PrintWriter out;
    private Scanner in;
    private boolean loggedIn;
    private boolean loggedOut;
    private ChatWindow chatWindow;


    public ChatService(Socket aSocket, ChatRoom aChatRoom)
    {
        socket = aSocket;
        chatRoom = aChatRoom;
        loggedIn = false;
        loggedOut = false;
        chatWindow = new ChatWindow();
    }

    public void run()
    {
        try
        {
            try
            {
                InputStream inStream = socket.getInputStream();
                OutputStream outStream = socket.getOutputStream();
                in = new Scanner(inStream);
                out = new PrintWriter(outStream);

                while (!loggedOut && in.hasNext())
                {
                    String command = in.next();
                    String response = executeCommand(command);
                    putMessage(response);
                }
            } finally
            {
                socket.close();
            }
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }


    public void putMessage(String message)
    {
        if (out != null)
        {

            out.println(message);
            out.flush();
        }
    }

    public String executeCommand(String command)
    {
        if (command.equals("LOGIN"))
        {
            username = JOptionPane.showInputDialog("Enter your username: ");
            chatRoom.register(username);
            chatRoom.broadcast(username, "LOGIN", this);
            loggedIn = true;
            return "Chat Room Manager: Hello, " + username + ".";
        }
        else if (!loggedIn)
        {
            in.nextLine(); // ignore the rest of the command
            return "ChatRoom Manager: You must LOGIN first";
        }
        else if (command.equals("CHAT"))
        {
            String message = chatWindow.getMessage();
            chatRoom.broadcast(username, message, this);
            chatWindow.postMessage(message, getUserName());
            return username + ": " + message;
        }
        else if (command.equals("LOGOUT"))
        {
            chatRoom.broadcast(username, "LOGOUT", this);
            chatRoom.leave(username);
            loggedOut = true;
            return "Goodbye";
        }

        in.nextLine(); // ignore the rest of the command
        return "Chat Room Manager: Invalid command";
    }

    public String getUserName()
    {
        return username;
    }
}
