import model.Bill;
import model.Rental;
import model.Scooter;
import org.assertj.core.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillTest {

    Scooter scooter1 = new Scooter();
    LocalDateTime start1 = LocalDateTime.of(2019,7,22,10,15);
    LocalDateTime end1 = LocalDateTime.of(2019,7,22,11,15);
    Rental rental = new Rental(start1,end1,scooter1);
    Bill bill1 = new Bill(rental);

    LocalDateTime start2 =LocalDateTime.of(2019,7,22,8,15);
    LocalDateTime end2 =LocalDateTime.of(2019,7,22,8,30);
    Rental rental2 = new Rental(start2,end2,scooter1);
    Bill bill2 = new Bill(rental2);

    LocalDateTime start3 =LocalDateTime.of(2019,7,21,8,15);
    LocalDateTime end3 =LocalDateTime.of(2019,7,21,9,15);
    Rental rental3 = new Rental(start3,end3,scooter1);
    Bill bill3 = new Bill(rental3);

    LocalDateTime start4 =LocalDateTime.of(2019,7,22,8,45);
    LocalDateTime end4 =LocalDateTime.of(2019,7,22,9,15);
    Rental rental4 = new Rental(start4,end4,scooter1);
    Bill bill4 = new Bill(rental4);



    //    @BeforeEach
//    void prepareData(){
//        Scooter scooter1 = new Scooter();
//        LocalDateTime start1 = LocalDateTime.of(2019,7,22,10,15);
//        LocalDateTime end1 = LocalDateTime.of(2019,7,22,11,15);
//        Rental rental = new Rental(start1,end1,scooter1);
//    }
    @Test
    void checkPricingHolidays(){
        double price = 30.0;
        assertEquals(price,bill3.countPrice());
    }
    @Test
    void checkPricingInRushHour(){
        double price = 30.0;
        assertEquals(30.0,bill2.countPrice());
    }
    @Test
    void checkPricingMethod(){
        double expected = 60.0;
        assertEquals(expected, bill1.countPrice());
    }
    @Test
    void checkPricingForDifferentTimes(){
        double expected = 45.0;

        assertEquals(expected,bill4.countPrice());
    }
    @Test
    void checkPricingForDifferent2(){
        double expected = 150.0;
        LocalDateTime start5 =LocalDateTime.of(2019,7,22,7,45);
        LocalDateTime end5 =LocalDateTime.of(2019,7,22,9,15);
        Rental rental5 = new Rental(start5,end5,scooter1);
        Bill bill5 = new Bill(rental5);
        assertEquals(expected,bill5.countPrice());
    }
    @Test
    void checkPricingForNightBetweenFriday(){
        double expected = 30.0;
        LocalDateTime start6 =LocalDateTime.of(2019,7,19,23,45);
        LocalDateTime end6 =LocalDateTime.of(2019,7,20,0,30);
        Rental rental6 = new Rental(start6,end6,scooter1);
        Bill bill6 = new Bill(rental6);
        assertEquals(expected,bill6.countPrice());
    }
}
