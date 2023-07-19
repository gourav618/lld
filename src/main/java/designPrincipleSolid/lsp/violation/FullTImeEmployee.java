package designPrincipleSolid.lsp.violation;

public class FullTImeEmployee extends Employee{

    /**
     * constructor to set employee id for employee object
     *
     * @param employeeId employee id
     */
    protected FullTImeEmployee(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("calculating salary for full time employee");
        return 0;
    }
}
