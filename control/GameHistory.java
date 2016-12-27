package control;

import model.Board;

import java.util.ArrayList;

/**
 * Name: Mick Zeller
 */
public class GameHistory
{

    private static ArrayList<Board> gameHistory;

    public GameHistory()
    {
        gameHistory = new ArrayList<>();
    }

    public static int getTurn(Board board)
    {
        return gameHistory.size();
    }

    public static void addHistory(Board board)
    {
        gameHistory.add(board);
    }

}
