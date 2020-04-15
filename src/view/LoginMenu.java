package view;

import model.Account;

import java.util.HashMap;

public class LoginMenu {
    private String username;
    private String password;

    public LoginMenu(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
