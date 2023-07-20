package designPrincipleSolid.lsp.confirmation;

public class ContractualEmployee extends Employee.EmployeeWithSalary {


    /**
     * constructor to set employee id for employee object
     *
     * @param employeeId employee id
     */
    protected ContractualEmployee(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("calculating salary for contractual employee");
        return 0;
    }
}
