package model;

import java.time.DayOfWeek;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;

public class Bill {
    private Rental rental;
    private double rushHourTarif = 2.0;
    private double ordinaryTarif = 1.0;
    private double holidaysTarif = 0.5;

    public Bill(Rental rental) {
        this.rental = rental;
    }


    public double givePrice(){
        long minutes = ChronoUnit.MINUTES.between(rental.getStart(),rental.getEnd());
        double price = minutes * ordinaryTarif;
        return price;
    }

//    public double giveRushHourPrice(){
//        if (rental.getStart().getDayOfWeek()!= DayOfWeek.SATURDAY && rental.getStart().getDayOfWeek()!= DayOfWeek.SUNDAY){
//
//        }
//    }
//
//    public double giveHolidaysPrice() {
//        double price = 0.0;
//        long minutes = 0;
//        if (rental.getStart().getDayOfWeek() == DayOfWeek.SATURDAY || rental.getStart().getDayOfWeek() == DayOfWeek.SUNDAY) {
//            if (rental.getEnd().getDayOfWeek() == DayOfWeek.SATURDAY || rental.getEnd().getDayOfWeek() == DayOfWeek.SUNDAY) {
//                minutes = ChronoUnit.MINUTES.between(rental.getStart(), rental.getEnd());
//                price = minutes * holidaysTarif;
//            }else{
//
//                minutes = ChronoUnit.MINUTES.between(rental.getStart(),rental.getStart().getDayOfWeek().adjustInto())
//            }
//        }
//        return price;
//    }


}
