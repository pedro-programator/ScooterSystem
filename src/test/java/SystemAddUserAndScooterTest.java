import controller.ScooterSystem;
import model.User;
import org.junit.jupiter.api.Test;


public class SystemAddUserAndScooterTest {

    ScooterSystem mySystem = new ScooterSystem();
    User user1 = new User("name1");
    User user2 = new User("name2");
    User user3 = new User("name3");

    @Test
    void checkAddingUsers() {
        mySystem.addUser(user1);

    }

}
