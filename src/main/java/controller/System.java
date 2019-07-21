package controller;

import model.*;

import java.time.LocalDateTime;

public class System {

private User user;
private Bill bill;
private Rental rental;
private Scooter scooter;
private DataBase dataBase;



public boolean rentScooter(User user, int IDScooter) {

    for (Scooter scooter : dataBase.getScooterList()) {
        if (scooter.getIDThisScooter() == IDScooter ) {
            if (!scooter.isRent()){
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
