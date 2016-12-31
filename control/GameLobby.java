package control;

import model.Player;

import java.util.ArrayList;

/**
 * Name: Mick Zeller
 */
public class GameLobby
{

    private ArrayList<Player> lobby;
    public static final int GAME_SIZE = 5;

    public GameLobby()
    {
        if (lobby == null)
        {
            lobby = new ArrayList<>(GAME_SIZE);
        }
    }

    public boolean registerPlayer(Player player)
    {
        if (lobby == null)
        {
            lobby = new ArrayList<>();
        }
        for (Player p : lobby)
        {
            if (!player.getName().equalsIgnoreCase(p.getName()))
            {
                lobby.add(player);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Player> getLobby()
    {
        return lobby;
    }
}
