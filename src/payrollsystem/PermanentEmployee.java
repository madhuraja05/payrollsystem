package payrollsystem;

public class PermanentEmployee extends Employee {
    private double houseAllowance;
    private double transportAllowance;

    public PermanentEmployee(double houseAllowance,double transportAllowance,String employeeid,String employeename,double basicsalary){
        super(employeeid,employeename,basicsalary);
        this.houseAllowance=houseAllowance;
        this.transportAllowance=transportAllowance;
    }

    public void setHouseAllowance(double houseAllowance){
        this.houseAllowance=houseAllowance;
    }
    public double getHouseAllowance(){
        return houseAllowance;
    }
    public void setTransportAllowance(double transportAllowanceransport){
        this.transportAllowance=transportAllowance;
    }
    public double getTransportAllowance(){
        return transportAllowance;
    }

    @Override
    public double calculateGrossSalary() {
        return getbasicsalary() + houseAllowance + transportAllowance;
    }

    @Override
    public double calculateDeduction() {
        return calculateGrossSalary() * 0.10;
    }

    }




