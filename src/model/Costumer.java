package model;

import java.util.ArrayList;

public class Costumer extends Account {
    private ArrayList<BuyAndSellLog> historyBuy;

    public Costumer(String username, String password) {
        super(username, password);
    }

}
