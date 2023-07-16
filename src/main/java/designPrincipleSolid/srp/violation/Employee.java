package designPrincipleSolid.srp.violation;

/**
 * Not following SRP-> Single Responsibility Principle
 * i.e A class must have only one reason to change
 *
 * but here it can change if any of these changes
 *      employee attribute management changes
 *      salary logic changes
 *      performance report logic changes
 *      bio data retrieve logic changes
 * Hence Multiple reason's for change , violates SRP
 */
public class Employee {

    private String id;

    /**
     * get the id of employee
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * calculate the employee salary and returns it
     * @param id employee id
     * @return calculated salary
     */
    public int calculateSalary(String id) {
        return 0;
    }

    /**
     * prints the performance report
     * @param id employee id
     * @return performance report object
     */
    public String printPerformanceReport(String id){
        return "performanceReport" + id;
    }

    /**
     * retrieve bio data for employee id
     * @param id employee id
     * @return bio data
     */
    public String retrieveBioData(String id){
        return "Bio data for" + id;
    }
}
