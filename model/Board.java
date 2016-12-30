package model;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Name: Mick Zeller
 */
public class Board extends Tile implements Serializable
{

    private ArrayList<Tile> gameBoard;
    private final int TOTAL_TILES = 108;

    public Board()
    {
        gameBoard = new ArrayList<>();
        for (int i = 0; i < TOTAL_TILES; i++)
        {
            gameBoard.add(new Tile(i));
        }
    }

    public void upDateTile(Tile tile, int updatedState)
    {
        tile.setState(updatedState);
        gameBoard.add(tile.getLocation(), tile);
    }


    public ArrayList<Tile> getGameBoard()
    {
        return gameBoard;
    }

    @Override
    public String toString()
    {
        return "" + getGameBoard();
    }
}
