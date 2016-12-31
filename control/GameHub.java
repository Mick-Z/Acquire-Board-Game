package control;

import java.util.ArrayList;

/**
 * Name: Mick Zeller
 */
public class GameHub
{


    ArrayList<Integer> board = new ArrayList<>(108); //contains all states of each tile within the board
    GameLobby gameLobby = new GameLobby();

    public void update(String updateGame)
    {
        String boardString = updateGame.substring(0, board.size() - 1);
        // TODO: 12/30/2016 Declare Strings for stocks and users that will be parsed from updateGame String

        int count = 0;

        while (count < 108)
        {
            board.add(count, Integer.parseInt(boardString.substring(count, count + 1)));
            count++;
        }

    }
}
