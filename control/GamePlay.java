package control;

import model.Board;

/**
 * Name: Mick Zeller
 */
public class GamePlay extends Messages
{
    private static GameHistory history;
    private int turn;

    static
    {
        history = new GameHistory();
    }

    public void send(Board board)
    {
        turn = board.gameIteration();
        history.addHistory(board, turn);

    }

    public String receive(Class<?> recieved)
    {
        return null;
    }
}
