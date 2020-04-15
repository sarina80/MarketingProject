package model;

import java.util.ArrayList;

public class Seller extends Account {
    private SellLog sellProducts;
    private String company;
    public Seller(String username, String password) {
        super(username, password);
    }


}
