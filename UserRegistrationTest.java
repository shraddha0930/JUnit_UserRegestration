package day20Practiceproblem;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String fName = userRegistration.validateFirstName("Shraddha");
        Assert.assertEquals("Happy", fName);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String fName = userRegistration.validateFirstName("sra");
        Assert.assertEquals("SAD", fName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String lName = userRegistration.validateLastName("sarode");
        Assert.assertEquals("Happy",lName);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String lName = userRegistration.validateFirstName("sra");
        Assert.assertEquals("SAD", lName);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String email = userRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertEquals("Happy",email);
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String email = userRegistration.validateFirstName(".abc@yahoo.com");
        Assert.assertEquals("SAD", email);
    }

    @Test
    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String phoneNumber = userRegistration.validatePhoneNumber("91 7822503725");
        Assert.assertEquals("Happy",phoneNumber);
    }
    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String phoneNumber = userRegistration.validateFirstName("sra");
        Assert.assertEquals("SAD", phoneNumber);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String password = userRegistration.validatePassword("Shr346$174sh");
        Assert.assertEquals("Happy",password);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String password = userRegistration.validateFirstName("sra");
        Assert.assertEquals("SAD", password);
    }
}
