package designPrincipleSolid.lsp.confirmation;

import java.util.List;

public class SalaryDisburser {

    public void disburseSalaries(List<Employee> employees){
        for(int i=0; i<employees.size(); i++){
            Employee employee = employees.get(i);
            //todo
            //employee.calculateSalary();
            //some logic to disburse salary
        }
    }
}
