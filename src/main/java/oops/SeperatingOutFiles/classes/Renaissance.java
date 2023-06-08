package oops.SeperatingOutFiles.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Renaissance {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private final List<String> freeTrialModules = new ArrayList<>();
    private final List<String> subscribedUserModules = new ArrayList<>();

    public Renaissance() {
        freeTrialModules.add("Gearing Up");
        subscribedUserModules.add("Gearing Up");
        subscribedUserModules.add("CS Fundamentals");
        subscribedUserModules.add("Low Level Design");
        subscribedUserModules.add("High Level Design");
    }

    /**
     * This method will check if the user credentials are valid or not.
     * If the user credentials are valid, then it will return true.
     * Else it will return false.
     */
    public Boolean isUserCredentialsValid(String email, String password) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if (!matcher.find()) {
            return false;
        }
        return isPresentInUserTable(email, password);
    }

    /**
     * This method will check if the user is present in the subscribers table.
     * If the user is present in the subscribers table, then it will return the list of modules subscribed by the user.
     * Else it will return the list of modules available for free trial.
     */
    public List<String> getModules(String email) {
        if (isPresentInSubscribersTable(email)) {
            return subscribedUserModules;
        }
        return freeTrialModules;
    }

    private boolean isPresentInSubscribersTable(String email) {
        /**
         * This method will check if the user is present in the subscribers table.
         * If the user is present in the subscribers table, then it will return true.
         * Else it will return false.
         */
        return true;
    }

    private Boolean isPresentInUserTable(String email, String password) {
        /**
         * This method will check if the user is present in the user table.
         * If the user is present in the user table, then it will return true.
         * Else it will return false.
         */
        return true;
    }

    public static void main(String[] args) {
        String email = "gourav123@yahoo.com", password = "123456";
        Renaissance renaissance = new Renaissance();
        if (renaissance.isUserCredentialsValid(email, password)) {
            System.out.println(renaissance.getModules(email));
        } else {
            System.out.println("Invalid Credentials");
        }

    }
}
