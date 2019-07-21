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


//    @BeforeEach
//    void prepareData(){
//        Scooter scooter1 = new Scooter();
//        LocalDateTime start1 = LocalDateTime.of(2019,7,22,10,15);
//        LocalDateTime end1 = LocalDateTime.of(2019,7,22,11,15);
//        Rental rental = new Rental(start1,end1,scooter1);
//    }
    @Test
    void checkPricingMethod(){
        double expected = 60.0;
        assertEquals(expected, bill1.givePrice());

    }
}
