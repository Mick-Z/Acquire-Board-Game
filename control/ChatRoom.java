package control;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Mick Zeller
 */
public class ChatRoom
{
    //to store chatLog messages
    private Map<String, String> chatLog;

    public ChatRoom()
    {
        if (chatLog == null)
        {
            chatLog = new HashMap<>();
        }
    }

    public Map<String, String> getChatLog()
    {
        return chatLog;
    }

    public void add(String user, String message)
    {
        for (String key : chatLog.keySet())
        {
            if (user.equalsIgnoreCase(key))
            {
                chatLog.put(key, message);
            }

            chatLog.put(user, message);
        }
    }
}
