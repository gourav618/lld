package designPrincipleSolid.lsp.violation;

import java.util.List;

public class SalaryDisburser {

    public void disburseSalaries(List<Employee> employees){
        for(int i=0; i<employees.size(); i++){
            Employee employee = employees.get(i);
            //violation of LSP
            //since we are checking for type of employee and then calculating salary
            //this is not a good design since we are not able to use the abstraction
            if (employee instanceof Volunteer){
                continue;
            }
            employee.calculateSalary();
            //some logic to disburse salary
        }
    }
}
