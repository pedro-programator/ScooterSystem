package controller;

import model.DataBase;
import model.Rental;
import model.Scooter;
import model.User;

import java.time.LocalDateTime;

public class ScooterSystem {
    private DataBase dataBase;

    public ScooterSystem() {
        this.dataBase = new DataBase();
    }

    public boolean addUser(User user) { //adds user to database.userList
        if (dataBase.getUserList().contains(user)) {
            return false;  //zwraca false, jeśli taki user już jest na liście
        } else {
            dataBase.getUserList().add(user);
            return true;
        }
    }

    public boolean addScooter(Scooter scooter) { //adds scooter to database.scooterList
        if (dataBase.getScooterList().contains(scooter)) {
            return false;  //zwraca false, jeśli taki user już jest na liście
        } else {
            dataBase.getScooterList().add(scooter);
            return true;
        }
    }

    public boolean rentScooter(User user, int IDScooter) {
        for (Scooter scooter : dataBase.getScooterList()) {
            if (scooter.getScooterID() == IDScooter && !scooter.isRent()) {
                scooter.setRent(true);
                Rental rental = new Rental(LocalDateTime.now(), scooter);
                user.addRental(rental);
                return true;
            }
        }
        return false;
    }

    public DataBase getDataBase() {
        return dataBase;
    }
}

