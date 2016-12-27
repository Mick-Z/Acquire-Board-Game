package model;

import java.io.Serializable;

/**
 * Name: Mick Zeller
 */
public class TileState implements Serializable
{

    private int state;

    public TileState()
    {
        state = 0;
    }

    public int getState()
    {
        return state;
    }

    public void setState(int updateState)
    {
        if (updateState < 0 || updateState > 9)
        {
            System.out.println("State must be between 0 and 9");
            return;
        }
        this.state = updateState;
    }
}
