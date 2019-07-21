package model;

import java.util.List;

public class DataBase {
    private List<Scooter> scooterList;
    private List<User> userList;

    public DataBase(List<Scooter> scooterList, List<User> userList) {
        this.scooterList = scooterList;
        this.userList = userList;
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
