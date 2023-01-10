package day20Practiceproblem;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
       boolean fName = userRegistration.validateFirstName("Shraddha");
        Assert.assertTrue(fName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lName = userRegistration.validateLastName("sarode");
        Assert.assertTrue(lName);
    }
}