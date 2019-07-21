package controller;

import model.DataBase;
import model.Scooter;
import model.User;

import java.util.List;

public class System {

    private List<User> userList;
    private List<Scooter> scooterList;
    private DataBase dataBase;

    public System(DataBase dataBase) {
        this.userList = dataBase.getUserList();
        this.scooterList = dataBase.getScooterList();
    }
}