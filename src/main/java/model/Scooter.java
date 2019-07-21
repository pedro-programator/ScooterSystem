package model;

import java.util.Objects;

public class Scooter {

    static private int numer =0;
    private int IDThisScooter;
    private boolean isRent;


    public Scooter( ) {
        this.IDThisScooter = numer;
        this.isRent = false ;
        numer+=1;
    }

    public boolean isRent() {
        return isRent;
    }

    public void setRent(boolean rent) {
        isRent = rent;
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
