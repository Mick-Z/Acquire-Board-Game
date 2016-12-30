package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Mick Zeller
 */
public class Assets
{
    public enum Hotel
    {
        American, Continental, Festival, Imperial, Luxor, Tower, Worldwide
    }

    private int money;


    public Assets()
    {
        money = 5000;
        new Stock();
    }

    public int getMoney()
    {
        return money;
    }

    public void setMoney(int cash)
    {
        money = getMoney() + cash;
    }


    class Stock
    {

        private Map<Hotel, Integer> holdings;

        public Stock()
        {
            holdings = new HashMap<>();

            holdings.put(Hotel.American, 0);
            holdings.put(Hotel.Continental, 0);
            holdings.put(Hotel.Festival, 0);
            holdings.put(Hotel.Imperial, 0);
            holdings.put(Hotel.Luxor, 0);
            holdings.put(Hotel.Tower, 0);
            holdings.put(Hotel.Worldwide, 0);
        }

        public Map<Hotel, Integer> getHoldings()
        {
            return holdings;
        }

        public void setHoldings(Map<Hotel, Integer> holdings)
        {
            this.holdings = holdings;
        }
    }
}
