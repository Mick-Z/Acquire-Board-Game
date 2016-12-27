package view;

import control.ChatListener;
import control.Messages;
import model.ChatLog;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Mick Zeller
 */
public class ChatSession
{

    private List<ChatListener> registeredChatListeners;

    public void register(ChatLog chatWindow)
    {
        if (registeredChatListeners == null)
            registeredChatListeners = new ArrayList<ChatListener>();
        registeredChatListeners.add(chatWindow);
    }

    public List<ChatListener> getRegisteredChatListeners()
    {
        return registeredChatListeners;
    }

    public void setRegisteredChatWindows(
            List<ChatListener> registeredChatListeners)
    {
        this.registeredChatListeners = registeredChatListeners;
    }

    public void incomingMessage(Long chatListenerId, Messages message)
    {
        publish(message);
    }

    protected void publish(Messages messageToPublish)
    {
        if (registeredChatListeners != null)
        {
            for (ChatListener eachListener : registeredChatListeners)
            {
                eachListener.notify(messageToPublish);
            }
        }
    }
}
