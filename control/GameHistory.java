package control;

import model.Board;

import java.util.ArrayList;

/**
 * Name: Mick Zeller
 */
public class GameHistory
{

    private ArrayList<Board> gameHistory;
    private static int turn = 0;


    public GameHistory()
    {
        gameHistory = new ArrayList<>();
    }



    public int getTurn(Board board)
    {
        return board.gameIteration();
    }

    public void addHistory(Board board, int setTurn)
    {
        for(Board b : gameHistory)
        {
            if(b.gameIteration() == setTurn)
            {
                System.out.println("Version of board has already been assigned " + setTurn + " value.");
                return;
            }
        }

        board.setGameTurn(setTurn);
        gameHistory.add(board);
    }

}
