package control;

import org.json.JSONObject;


/**
 * Name: Mick Zeller
 */
public class ServerService
{

    public enum Type
    {
        CHAT("chat"), BOARD("board"), JOIN("join"), START("start");

        private String type;

        Type(String chat)
        {
            type = chat;
        }

        public String getType()
        {
            return type;
        }
    }


    private String module = "acquire"; //whatever game you want
    private String action = "broadcast"; //debug, log
//    private String type = "application";


    public JSONObject toServer(String message, Type type)
    {
        JSONObject serverJSON = new JSONObject();

        serverJSON.put("module", module);
        serverJSON.put("action", action);
        serverJSON.put("type", type.getType());
        serverJSON.put("message", message);

        return serverJSON;
    }

    public String fromServer(String incomingData)
    {
        JSONObject serverJSON = new JSONObject();
        // TODO: 12/30/2016 need to implement this
        return serverJSON.toString();
    }

}
