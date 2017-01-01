package control;

import model.Board;
import model.Tile;
import server.IPCQueue;

/**
 * Name: Mick Zeller
 */
public class GameHub
{


    private GameLobby gameLobby = new GameLobby();
    private Board board;
    private int[] gameBoard;
    private boolean isStarted = false;
    private ServerService serverService;

    public GameHub()
    {
        board = new Board();
        serverService = new ServerService(new IPCQueue(8989));
        gameBoard = new int[ board.getGameBoard().size() ];

        int count = 0;

        for (Tile tile : board.getGameBoard())
        {
            if (count == tile.getLocation())
            {
                gameBoard[ count ] = tile.getState();
                count++;
            }
        }
    }

    public int[] createBoard()
    {
        isStarted = true;
        return gameBoard;
    }

    public int[] updateBoard(String board) // will be sent to the BoardPanel class
    {
        if (!isStarted)
        {
            createBoard();
        }
        int count = 0;
        while (count < gameBoard.length)
        {
            gameBoard[ count ] = Integer.parseInt(board.substring(count, count + 1));
            count++;
        }
        return gameBoard;


    }
}
