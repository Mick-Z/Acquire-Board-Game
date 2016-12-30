package model;

import java.io.Serializable;

/**
 * Name: Mick Zeller
 */
public class Tile implements Serializable
{

    private int tileLocation;
    private int state;

    public Tile(int location)
    {
        setState(0);
        this.tileLocation = location;
    }

    public Tile()
    {
        setState(0);
    }

    public int getLocation()
    {
        return tileLocation;
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

    @Override
    public String toString()
    {
        return getLocation() + ":" + getState();
    }

}


