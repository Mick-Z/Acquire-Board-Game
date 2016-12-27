package model;

import java.io.Serializable;

/**
 * Name: Mick Zeller
 */
public class Tile extends TileState implements Serializable
{

    private int locationX;
    private int locationY;


    public Tile(int locationX, int locationY)
    {
        new TileState();
        setLocationX(locationX);
        setLocationY(locationY);
    }

    public Tile()
    {
        new TileState();
    }

    public int getLocationX()
    {
        return locationX;
    }

    public int getLocationY()
    {
        return locationY;
    }

    public void setLocationX(int locationX)
    {
        this.locationX = locationX;
    }

    public void setLocationY(int locationY)
    {
        this.locationY = locationY;
    }
}
