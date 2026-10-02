package payrollsystem;

public abstract class Employee {
    private String employeeid;
    private String employeename;
    private double baiscsalary;

    public Employee(String employeeid, String employeename, double basicsalary) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.baiscsalary = basicsalary;
    }

    public void setemployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getemployeeid() {
        return employeeid;
    }

    public void setemployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getemployeename() {
        return employeename;
    }

    public void setbasicsalary(double basicsalary) {
        this.baiscsalary = basicsalary;
    }

    public double getbasicsalary() {
        return baiscsalary;
    }

    public void displayEmployeeDetails() {

        System.out.println("Employee ID: " + employeeid);
        System.out.println("Employee Name: " + employeename);
        System.out.println("Basic Salary: " + baiscsalary);
    }

    public abstract double calculateGrossSalary(); //abstract method

    public abstract double calculateDeduction();

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateDeduction();
    }
}
