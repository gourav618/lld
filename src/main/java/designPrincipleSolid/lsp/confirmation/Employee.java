package designPrincipleSolid.lsp.confirmation;

/**
 * so now volunteer can be this employee class and it will not break the code
 */
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
     * another class created to calculate salary for employee
     */
    public abstract static class EmployeeWithSalary extends Employee {
        protected EmployeeWithSalary(int employeeId) {
            super(employeeId);
        }

        protected abstract double calculateSalary();
    }

    /*
     * fields and method are protected since we want it to be only accessed by child class
     * and not by any other class
     */
}
