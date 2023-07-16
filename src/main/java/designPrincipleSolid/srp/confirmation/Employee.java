package designPrincipleSolid.srp.confirmation;

/**
 * Abides SRP and have only 1 responsibility i.e employee attribute management
 */
public class Employee {
    private String id;

    public Employee(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
