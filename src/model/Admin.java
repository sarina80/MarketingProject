package model;

//just admins can make admin account
public class Admin extends Account {
    public Admin(String username, String password) {
        super(username, password);
    }
}
