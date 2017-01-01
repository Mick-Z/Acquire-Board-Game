package control;

import org.json.JSONObject;
import server.IPCQueue;


/**
 * Name: Mick Zeller
 */
public class ServerService
{

    IPCQueue ipcQueue;

    public ServerService(IPCQueue ipcQueue)
    {
        this.ipcQueue = ipcQueue;
    }

    public void gameJSON(String message, GameService.Type type)
    {
        JSONObject json = new JSONObject();

        ipcQueue.sendMessage(json);
    }

}
