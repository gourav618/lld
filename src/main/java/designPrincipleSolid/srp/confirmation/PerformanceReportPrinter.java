package designPrincipleSolid.srp.confirmation;

public class PerformanceReportPrinter {

    /**
     * prints the performance report
     * @param e employee object
     * @return performance report object
     */
    public String printPerformanceReport(Employee e) {
        return "performanceReport" + e.getId();
    }
}
