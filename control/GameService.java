package control;

/**
 * Name: Mick Zeller
 */
public class GameService
{
    public enum Type
    {
        CHAT("chat"), BOARD("board"), JOIN("join"), START("start");

        private String type;

        Type(String chat)
        {
            type = chat;
        }

        public String getType()
        {
            return type;
        }
    }
}
