package oops.SeperatingOutFiles.classes2;

import java.util.ArrayList;
import java.util.List;

public class ModulesRetriever {

    private final List<String> freeTrialModules = new ArrayList<>();
    private final List<String> subscribedUserModules = new ArrayList<>();

    public ModulesRetriever() {
        freeTrialModules.add("Gearing Up");
        subscribedUserModules.add("Gearing Up");
        subscribedUserModules.add("CS Fundamentals");
        subscribedUserModules.add("Low Level Design");
        subscribedUserModules.add("High Level Design");
    }

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
}
