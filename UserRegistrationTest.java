package day20Practiceproblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    day20Practiceproblem.UserRegistration operation;
    /*@ParameterizedTest
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
    }*/
    @BeforeEach
    public void setUp() {
        operation = new day20Practiceproblem.UserRegistration();
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        Assertions.assertDoesNotThrow(() -> {
            operation.validateFirstName("shraddha");
        });
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        Assertions.assertThrows(UserRegException.class, () -> {
            operation.validateFirstName("shr");
        });
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        Assertions.assertDoesNotThrow(() -> {
            operation.validateLastName("Dev");
        });
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        Assertions.assertThrows(UserRegException.class, () -> {
            operation.validateLastName("dev");
        });
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        Assertions.assertDoesNotThrow(() -> {
            operation.validateEmail("abc.xyz@bl.co.in");
        });
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        Assertions.assertThrows(UserRegException.class, () -> {
            operation.validateEmail("jas@.com.aa.asd");
        });
    }

    @Test
    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnTrue() {
        Assertions.assertDoesNotThrow(() -> {
            operation.validatePhoneNumber("91 8767998269");
        });
    }
    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        Assertions.assertThrows(UserRegException.class, () -> {
            operation.validatePhoneNumber("914767698269");
        });
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        Assertions.assertDoesNotThrow(() -> {
            operation.validatePassword("Qwsd@12345");
        });
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        Assertions.assertThrows(UserRegException.class, () -> {
            operation.validatePassword("Qw@#12");
        });
    }
}