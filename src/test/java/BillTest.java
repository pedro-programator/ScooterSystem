import model.Rental;
import model.Scooter;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class BillTest {

    Scooter scooter1 = new Scooter();
    LocalDateTime start1 = LocalDateTime.of(2019,7,22,10,15);
    LocalDateTime end1 = LocalDateTime.of(2019,7,22,11,15);
    Rental rental = new Rental(start1,end1,scooter1);


//    @BeforeEach
//    void prepareData(){
//        Scooter scooter1 = new Scooter();
//        LocalDateTime start1 = LocalDateTime.of(2019,7,22,10,15);
//        LocalDateTime end1 = LocalDateTime.of(2019,7,22,11,15);
//        Rental rental = new Rental(start1,end1,scooter1);
//    }
    @Test
    void checkPricingMethod(){

    }
}
