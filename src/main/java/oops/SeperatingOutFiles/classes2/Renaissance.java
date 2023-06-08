package oops.SeperatingOutFiles.classes2;

public class Renaissance {
    public static void main(String[] args) {
        String email = "gourav123@yahoo.com", password = "123456";
        UserCredentialsValidator userCredentialsValidator = new UserCredentialsValidator(email, password);
        ModulesRetriever modulesRetriever = new ModulesRetriever();
        if (userCredentialsValidator.validate(email, password)) {
            System.out.println(modulesRetriever.getModules(email));
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}
