package day20Practiceproblem;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-z]{1,10}[._+-]?[a-z]{1,10}?[\\@][a-z]{1,10}[\\.][a-z]{1,4}[\\.][a-z]{2}$";
    private static final String PHONE_PATTERN = "^[1-9]{2}(\\s)[6-9]{1}[0-9]{9}$";
    private static final String PASSWORD_PATTERN ="^[A-Za-z0-9!@#$%^&*]{8,}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matches(NAME_PATTERN,fname);
    }

    public boolean validateLastName(String lName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matches(NAME_PATTERN,lName);
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matches(EMAIL_PATTERN,email);
    }
    public boolean validatePhoneNumber(String phNumber) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        return pattern.matches(PHONE_PATTERN, phNumber);
    }
    public boolean validatePassword(String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matches(PASSWORD_PATTERN, password);
    }
}
