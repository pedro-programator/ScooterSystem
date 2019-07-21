package model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Bill {
    private double rushHourTarif = 2.0;
    private double ordinaryTarif = 1.0;
    private double holidaysTarif = 0.5;
    long minutes;
    double price;
    int scooterNumber;

    public Bill(Rental rental) {
        this.minutes = ChronoUnit.MINUTES.between(rental.getStart(), rental.getEnd());
        this.scooterNumber = rental.getScooter().getScooterID();
        this.price = countPrice(rental);
    }

    public double countPrice(Rental rental) {
        double price = 0.0;
        LocalDateTime temp;
        for (int i = 0; i < ChronoUnit.MINUTES.between(rental.getStart(), rental.getEnd()); i++) {
            temp = rental.getStart().plusMinutes(i);
            if (temp.getDayOfWeek() == DayOfWeek.SATURDAY || temp.getDayOfWeek() == DayOfWeek.SUNDAY) {
                price += holidaysTarif;
            } else {
                if (temp.getHour() == 8 || temp.getHour() == 18) {
                    price += rushHourTarif;
                } else {
                    price += ordinaryTarif;
                }
            }
        }
        return price;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "minutes=" + minutes +
                ", price=" + price +
                ", scooterNumber=" + scooterNumber +
                '}';
    }
}
