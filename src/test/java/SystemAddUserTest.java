import controller.System;
import model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SystemAddUserTest {

    System mySystem = new System();
    User user1 = new User("name1");
    User user2 = new User("name2");
    User user3 = new User("name3");


    @AfterEach
    void cleanUp() {
        java.lang.System.out.println("Cleaning list after test");
        mySystem.getDataBase().getUserList().clear();
    }

    @Test
    void checkAddingUsers() {
        assertTrue(mySystem.addUser(user1));
        assertTrue(mySystem.addUser(user2));
        assertTrue(mySystem.addUser(user3));
    }

    @Test
    void checkAddingSameUser() {
        mySystem.addUser(user1);
        assertFalse(mySystem.addUser(user1));
    }

}