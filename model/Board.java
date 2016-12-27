package model;

import java.io.Serializable;

/**
 * Name: Mick Zeller
 */
public class Board extends Tile implements Serializable
{

    private Tile[][] gameBoard;
    private int gameTurn = 0;
    private final int ROW = 12;
    private final int COLUMN = 12;


    public Board()
    {
        gameBoard = new Tile[ ROW ][ COLUMN ];

        for (int x = 0; x < ROW; x++)
        {
            for (int y = 0; y < COLUMN; y++)
            {
                gameBoard[ x ][ y ] = new Tile(x, y);
            }
        }


    }

    public void upDateTile(Tile tile, int updatedState)
    {
        tile.setState(updatedState);
        gameBoard[ tile.getLocationX() ][ tile.getLocationY() ] = tile;
    }

    public int gameIteration()
    {
        return gameTurn;
    }

    public void setGameTurn(int turn)
    {
        if (turn < gameTurn)
        {
            return;
        }
        else
        {
            this.gameTurn = turn;
        }

    }

}
