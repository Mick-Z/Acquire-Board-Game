package control;

/**
 * Name: Mick Zeller
 */
public class GameHub
{


    GameLobby gameLobby = new GameLobby();

    public int[] updateBoard() // will be sent to the BoardPanel class
    {
        String tempBoardNeedsToBeParsed = "0568791565487958641310065849856512345687898540654506548987654231356465465465465465465413216548974654651321023";
        int[] board = new int[ tempBoardNeedsToBeParsed.length() ];

        int count = 0;
        while (count < board.length)
        {
            board[ count ] = Integer.parseInt(tempBoardNeedsToBeParsed.substring(count, count + 1));
            count++;
        }
        return board;
    }
}
