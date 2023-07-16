package designPrincipleSolid.srp.confirmation;

public class Tester {

    public static void main(String[] args){
        /**
         * All classes Employee, SalaryCalculator, PerformanceReportPrinter and BioDataRetriever have single responsibility
         * and validate SRP
         * so code is less fragile and cleaner
         */
        Employee e = new Employee("01");
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        PerformanceReportPrinter performanceReportPrinter = new PerformanceReportPrinter();
        BioDataRetriever bioDataRetriever = new BioDataRetriever();
        System.out.println(salaryCalculator.calculateSalary(e));
        System.out.println(performanceReportPrinter.printPerformanceReport(e));
        System.out.println(bioDataRetriever.retrieveBioData(e));
    }
}
