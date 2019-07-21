package model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Scooter> scooterList = new ArrayList<>();
    private List<User> userList = new ArrayList<>();

    public DataBase() {
    }

    public List<Scooter> getScooterList() {
        return scooterList;
    }

    public void setScooterList(List<Scooter> scooterList) {
        this.scooterList = scooterList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
