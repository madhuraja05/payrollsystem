package payrollsystem;

public class ContractEmployee extends Employee {
    private double contractBonus;

    public ContractEmployee(double contractBonus, String employeeid,String employeename,double basicsalary){
        super(employeeid,employeename,basicsalary);
        this.contractBonus=contractBonus;
    }

    public void setContractBonus(double contractBonus){
        this.contractBonus=contractBonus;
    }
    public double getContractBonus(){
        return contractBonus;
    }

    @Override
    public double calculateGrossSalary(){
        return getbasicsalary()+contractBonus;
    }
    @Override
    public double calculateDeduction(){
        return calculateGrossSalary()*0.05;
    }



}



