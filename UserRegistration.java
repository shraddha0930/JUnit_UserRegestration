package day20Practiceproblem;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9][a-zA-Z0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-z]{2,4}([.][a-zA-Z]{2,4})?$";
    private static final String PHONE_PATTERN = "^[1-9]{2}(\\s)[6-9]{1}[0-9]{9}$";
    private static final String PASSWORD_PATTERN ="^[A-Za-z0-9!@#$%^&*]{8,}$";

    public boolean validateFirstName(String name) throws UserRegException {
        Pattern p = Pattern.compile(name);
        if(!Pattern.matches(NAME_PATTERN, name)){
            throw new UserRegException("Invalid First Name..!!");
        }
        return true;
    }
    public boolean validateLastName(String name) throws UserRegException {
        Pattern p = Pattern.compile(name);
        if(!Pattern.matches(NAME_PATTERN, name)){
            throw new UserRegException("Invalid Last Name..!!");
        }
        return true;
    }
    public boolean validateEmail(String email) throws UserRegException {
        Pattern p =Pattern.compile(email);
        if(!Pattern.matches(EMAIL_PATTERN, email)){
            throw new UserRegException("Invalid Email..!!");
        }
        return true;
    }
    public boolean validatePhoneNumber(String phoneNum) throws UserRegException {
        Pattern p = Pattern.compile(phoneNum);
        if(!Pattern.matches(PHONE_PATTERN, phoneNum)) {
            throw new UserRegException("Invalid Phone Number..!!");
        }
        return true;
    }
    public boolean validatePassword(String password) throws Exception {
        Pattern p = Pattern.compile(password);
        if(!Pattern.matches(PASSWORD_PATTERN, password)){
            throw new UserRegException("Invalid Password..!!");
        }
        return true;
    }
}
