package control;

import org.json.JSONObject;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Name: Mick Zeller
 */
public class GameService implements Runnable
{

    private JSONObject toServer;
    private JSONObject fromServer;
    private GameHub game;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;


    public GameService(Socket aSocket, GameHub aGame)
    {
        socket = aSocket;
        game = aGame;
    }

    @Override
    public void run()
    {
        try
        {
            in = new Scanner(socket.getInputStream());
            out = new PrintWriter(socket.getOutputStream());
            doService();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void doService() throws IOException
    {
        while (true)
        {
            if (!in.hasNext())
            {
                return;
            }
            String command = in.next();

            executeCommand(command);
        }
    }

    private void executeCommand(String command)
    {

        if (command.equalsIgnoreCase("CHAT"))
        {

        }
        else if (command.equalsIgnoreCase("BOARD"))
        {

        }
        else if (command.equalsIgnoreCase("JOIN"))
        {

        }
        else if (command.equalsIgnoreCase("START"))
        {

        }
    }


}



