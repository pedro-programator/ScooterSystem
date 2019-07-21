package model;

import java.util.Objects;

public class Scooter {

    static private int number =0;
    private int IDThisScooter;
    private boolean isRent;


    public Scooter( ) {
        this.IDThisScooter = number;
        this.isRent = false ;
        number +=1;
    }

    public boolean isRent() {
        return isRent;
    }

    public void setRent(boolean rent) {
        isRent = rent;
    }

    public int getIDThisScooter() {
        return IDThisScooter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scooter scooter = (Scooter) o;
        return IDThisScooter == scooter.IDThisScooter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(IDThisScooter);
    }

    @Override
    public String toString() {
        return "Scooter "+IDThisScooter+" is Rent "+ isRent;
    }
}
