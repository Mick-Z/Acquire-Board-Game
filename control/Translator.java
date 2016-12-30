package control;

import model.Board;
import model.Player;
import org.json.JSONObject;

/**
 * Name: Mick Zeller
 */
public class Translator
{

    private JSONObject sendingJSON;
    private String readingJSON;
    private Board board;


    public Translator()
    {
        if (board == null)
        {
            board = new Board();
        }
    }


    public JSONObject traslation(Board aBoard, Player player)
    {

        return sendingJSON;
    }

    public String traslation(JSONObject jsonObject)
    {

        return readingJSON;
    }

}
