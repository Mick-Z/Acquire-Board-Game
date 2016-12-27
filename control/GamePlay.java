package control;


/**
 * Name: Mick Zeller
 */
public class GamePlay implements Messages
{
    private static GameHistory history;
    private int turn;

    static
    {
        history = new GameHistory();
    }


    @Override
    public String getValue()
    {
        return null;
    }

    @Override
    public void setValue(String value)
    {

    }
}
