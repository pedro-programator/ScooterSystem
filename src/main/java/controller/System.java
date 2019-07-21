package controller;

import model.DataBase;
import model.Rental;
import model.Scooter;
import model.User;

import java.time.LocalDateTime;
import java.util.List;

public class System {


    private DataBase dataBase;

    public System() {
        this.dataBase = new DataBase();
    }

    public boolean rentScooter(User user, int IDScooter) {

        for (Scooter scooter : dataBase.getScooterList()) {
            if (scooter.getIDThisScooter() == IDScooter) {
                if (!scooter.isRent()) {
                    scooter.setRent(true);
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

