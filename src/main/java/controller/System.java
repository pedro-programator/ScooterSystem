package controller;

import model.DataBase;
import model.Rental;
import model.Scooter;
import model.User;

import java.time.LocalDateTime;

public class System {
    private DataBase dataBase;

    public System() {
        this.dataBase = new DataBase();
    }


    public void addUser(User user) { //adds user to database.userList
        dataBase.getUserList().add(user);
    }

    public void addScooter(Scooter scooter) { //adds scooter to database.scooterList
        dataBase.getScooterList().add(scooter);
    }

    public boolean rentScooter(User user, int IDScooter) {
        for (Scooter scooter : dataBase.getScooterList()) {
            if (scooter.getScooterID() == IDScooter) {
                if (!scooter.isRent()) {
                    Rental rental = new Rental(LocalDateTime.now(), scooter);
                    user.addRental(rental);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}

