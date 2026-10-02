package payrollsystem;

public class Manager extends PermanentEmployee {
    private double performanceBonus;

    public Manager(double performanceBonus,double houseAllowance,double transportAllowance,String employeeid,String employeename,double basicsalary){
        super(houseAllowance, transportAllowance, employeeid, employeename, basicsalary);
        this.performanceBonus=performanceBonus;
    }

    public void setPerformanceBonus(double performanceBonus){
        this.performanceBonus=performanceBonus;
    }
    public double getPerformanceBonus(){
        return performanceBonus;
    }


    @Override
    public double calculateGrossSalary() {
        return getbasicsalary() + getHouseAllowance() + getTransportAllowance() + performanceBonus;
    }
    @Override
    public double calculateDeduction(){
        return calculateGrossSalary()*0.12;
    }




}
