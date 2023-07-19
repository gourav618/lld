package designPrincipleSolid.lsp.violation;

public class Volunteer extends Employee{
    /**
     * constructor to set employee id for employee object
     *
     * @param employeeId employee id
     */
    protected Volunteer(int employeeId) {
        super(employeeId);
    }

    /**
     * abstract method to calculate salary for employee (Volunteer should not have salary)
     * @return throw exception since Volunteer should not have salary
     */
    @Override
    protected double calculateSalary() {
        throw new RuntimeException("Volunteer should not have salary");
    }
}
