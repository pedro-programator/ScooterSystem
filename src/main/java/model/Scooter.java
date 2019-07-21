package model;

import java.util.Objects;

public class Scooter {

    static private int number = 1;
    private int ScooterID;
    private boolean isRent;


    public Scooter() {
        this.ScooterID = number;
        this.isRent = false;
        number += 1;
    }

    public boolean isRent() {
        return isRent;
    }

    public void setRent(boolean rent) {
        isRent = rent;
    }

    public int getScooterID() {
        return ScooterID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scooter scooter = (Scooter) o;
        return ScooterID == scooter.ScooterID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ScooterID);
    }

    @Override
    public String toString() {
        return "Scooter " + ScooterID + " is Rent " + isRent;
    }
}
