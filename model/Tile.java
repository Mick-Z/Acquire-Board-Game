package model;

import java.io.Serializable;

/**
 * Name: Mick Zeller
 */
public class Tile implements Serializable
{

    private int tileLocation;
    private TileState tileState;

    public Tile(int location)
    {
        tileState = new TileState();
        this.tileLocation = location;
    }

    public Tile()
    {
        new TileState();
    }

    public int getLocation()
    {
        return tileLocation;
    }


    public void setTileLocation(int location)
    {
        tileLocation = location;
    }


    @Override
    public String toString()
    {
        return getLocation() + ":" + tileState.getState();
    }

    class TileState
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
}

