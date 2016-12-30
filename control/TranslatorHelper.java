package control;


/**
 * Name: Mick Zeller
 */
public class TranslatorHelper
{

    ChatRoom chatRoom = new ChatRoom();
    GameHub gameHub = new GameHub();

    public void translate(String action, String user, String message)
    {
        if (action.equalsIgnoreCase("chat"))
        {
            chatRoom.add(user, message);
        }

        else if (action.equalsIgnoreCase("board"))
        {
            gameHub.update(message);
        }


    }


}
