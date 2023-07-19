package designPrincipleSolid.lsp.violation;

public abstract class Employee {

    protected final int employeeId;

    /**
     * constructor to set employee id for employee object
     * @param employeeId employee id
     */
    protected Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * abstract method to calculate salary for employee
     * @return
     */
    protected abstract double calculateSalary();


    /*
     * fields and method are protected since we want it to be only accessed by child class
     * and not by any other class
     */
}
