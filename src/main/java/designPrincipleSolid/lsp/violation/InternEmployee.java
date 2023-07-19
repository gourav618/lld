package designPrincipleSolid.lsp.violation;

public class InternEmployee extends Employee{

    /**
     * constructor to set employee id for employee object
     *
     * @param employeeId employee id
     */
    protected InternEmployee(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("calculating salary for intern employee");
        return 0;
    }
}
