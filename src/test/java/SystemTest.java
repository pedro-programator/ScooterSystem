import model.Scooter;
import model.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import controller.System;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SystemTest {

    System system = new System();


    Scooter scooter1 = new Scooter();
    Scooter scooter2 = new Scooter();
    Scooter scooter3 = new Scooter();

    User user1 = new User("Artur1");
    User user2 = new User("Artur2");
    User user3 = new User("Artur3");
    User user4 = new User("Artur3");
    User user5 = new User("Artur3");
    @BeforeEach
    void preperData() {

        system.addUser(user1);
        system.addUser(user2);
        system.addUser(user3);
        system.addUser(user4);
        system.addUser(user5);

        system.addScooter(scooter1);
        system.addScooter(scooter2);
        system.addScooter(scooter3);
    }


    @Test
    void rentScooterTest() {
        assertTrue(system.rentScooter(user1,0));
        assertTrue(system.rentScooter(user2,1));
        assertTrue(system.rentScooter(user3,2));
        assertFalse(system.rentScooter(user3,3));
        assertFalse(system.rentScooter(user3,2));


    }


}
