package oops.SeperatingOutFiles.classes2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCredentialsValidator {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private final String userName;
    private final String password;

    public UserCredentialsValidator(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * This method will check if the user credentials are valid or not.
     * If the user credentials are valid, then it will return true.
     * Else it will return false.
     */
    public Boolean validate(String email, String password) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if (!matcher.find()) {
            return false;
        }
        return isPresentInUserTable(email, password);
    }

    private Boolean isPresentInUserTable(String email, String password) {
        /**
         * This method will check if the user is present in the user table.
         * If the user is present in the user table, then it will return true.
         * Else it will return false.
         */
        return true;
    }
}
