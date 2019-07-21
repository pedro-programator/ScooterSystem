package controller;

import model.DataBase;
import model.Rental;
import model.Scooter;
import model.User;

import java.time.LocalDateTime;
import java.util.List;

public class System {

    private List<User> userList;
    private List<Scooter> scooterList;
    private DataBase dataBase;

    public System(DataBase dataBase) {
        this.userList = dataBase.getUserList();
        this.scooterList = dataBase.getScooterList();
    }

    public boolean rentScooter(User user, int IDScooter) {

        for (Scooter scooter : dataBase.getScooterList()) {
            if (scooter.getIDThisScooter() == IDScooter) {
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

