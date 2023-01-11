package day20Practiceproblem;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9][a-zA-Z0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-z]{2,4}([.][a-zA-Z]{2,4})?$";
    private static final String PHONE_PATTERN = "^[1-9]{2}(\\s)[6-9]{1}[0-9]{9}$";
    private static final String PASSWORD_PATTERN ="^[A-Za-z0-9!@#$%^&*]{8,}$";

    public String validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        if (pattern.matches(NAME_PATTERN,fname)== true)
            return "HAPPY";
        else
            return "SAD";
    }

    public String validateLastName(String lName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        if (pattern.matches(NAME_PATTERN,lName)== true)
            return "HAPPY";
        else
            return "SAD";
    }

    public String validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        if (pattern.matches(EMAIL_PATTERN,email)== true)
            return "HAPPY";
        else
            return "SAD";
    }
    public String validatePhoneNumber(String phNumber) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        if (pattern.matches(PHONE_PATTERN, phNumber)== true)
            return "HAPPY";
        else
            return "SAD";
    }
    public String validatePassword(String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        if (pattern.matches(PASSWORD_PATTERN, password)== true)
            return "HAPPY";
        else
            return "SAD";
    }
}
