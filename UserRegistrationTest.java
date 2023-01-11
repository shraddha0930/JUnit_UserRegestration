package day20Practiceproblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.stream.Stream;

public class UserRegistrationTest {
    UserRegistration operation;
    @ParameterizedTest
    @MethodSource("getEmailTests")
    public void test_email(String email, boolean expResult){
        Assert.assertEquals(expResult, operation.validateEmail(email));
    }
    private static Stream<Arguments> getEmailTests(){
        return Stream.of(
                Arguments.of("abc@yahoo.com", true),
                Arguments.of("abc-100@yahoo.com", true),
                Arguments.of("abc.100@yahoo.com", true),
                Arguments.of("abc111@abc.com", true),
                Arguments.of("abc@.com.my", false),
                Arguments.of("abc@gmail.com.aa.au", false),
                Arguments.of(".abc@com.com",false),
                Arguments.of("abc+100@gmail.com",true)
        );
    }
    @BeforeEach
    public void setUp() {
        operation = new UserRegistration();
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean fName = userRegistration.validateFirstName("Shraddha");
        Assert.assertTrue( fName);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean fName = userRegistration.validateFirstName("sra");
        Assert.assertTrue(fName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lName = userRegistration.validateLastName("sarode");
        Assert.assertTrue(lName);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lName = userRegistration.validateFirstName("sra");
        Assert.assertTrue(lName);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(email);
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.validateFirstName(".abc@yahoo.com");
        Assert.assertTrue( email);
    }

    @Test
    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("91 7822503725");
        Assert.assertTrue(phoneNumber);
    }
    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validateFirstName("sra");
        Assert.assertTrue(phoneNumber);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("Shr346$174sh");
        Assert.assertTrue(password);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validateFirstName("sra");
        Assert.assertTrue( password);
    }
}