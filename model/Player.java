package model;

/**
 * Name: Mick Zeller
 */
public class Player extends Assets
{

    private String name;

    public Player(String nickname)
    {
        this.name = nickname;
        new Assets();
    }

    public String getName()
    {
        return name;
    }

}
