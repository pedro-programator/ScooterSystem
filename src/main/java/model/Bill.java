package model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
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


    public double givePriceOrdinary() {
        long minutes = ChronoUnit.MINUTES.between(rental.getStart(), rental.getEnd());
        double price = minutes * ordinaryTarif;
        return price;
    }

    public double givePriceRushHour() {
        long minutes = ChronoUnit.MINUTES.between(rental.getStart(), rental.getEnd());
        double price = minutes * rushHourTarif;
        return price;
    }

    public double giveHolidaysPrice() {
        long minutes = ChronoUnit.MINUTES.between(rental.getStart(), rental.getEnd());
        double price = minutes * holidaysTarif;
        return price;
    }

    public double givePriceForAll() {
        double price = 0.0;
        if (rental.getStart().getDayOfWeek() == DayOfWeek.SATURDAY || rental.getStart().getDayOfWeek() == DayOfWeek.SUNDAY) {
            price = giveHolidaysPrice();
        } else {
            price = countPriceForWeekDays();
        }
        return price;
    }

    public double countPrice() {
        double price = 0.0;
        LocalDateTime temp;
        for (int i = 0; i < ChronoUnit.MINUTES.between(rental.getStart(), rental.getEnd()); i++) {
            temp = rental.getStart().plusMinutes(i);

            if (temp.getDayOfWeek() == DayOfWeek.SATURDAY || temp.getDayOfWeek() == DayOfWeek.SUNDAY) {
                price += holidaysTarif;
            }else{
                if (temp.getHour() == 8 || temp.getHour() == 18) {
                    price += rushHourTarif;
                } else {
                    price += ordinaryTarif;
            }
            }
        }
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
