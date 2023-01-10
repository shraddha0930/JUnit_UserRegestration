package day20Practiceproblem;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

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
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(email);
    }
    @Test
    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("91 7822503725");
        Assert.assertTrue(phoneNumber);
    }
}