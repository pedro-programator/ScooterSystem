package model;

public class Bill {
    private Rental rental;
    private double rushHourTarif = 2.0;
    private double ordinaryTarif = 1.0;
    private double holidaysTarif = 0.5;

    public Bill(Rental rental) {
        this.rental = rental;
    }


}
