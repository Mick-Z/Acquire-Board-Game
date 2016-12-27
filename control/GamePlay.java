package control;


/**
 * Name: Mick Zeller
 */
public class GamePlay implements Messages
{

    private String value;

    public GamePlay(String message)
    {
        this.value = message;
    }

    @Override
    public String getValue()
    {
        return value;
    }

    @Override
    public void setValue(String value)
    {
        this.value = value;
    }
}
