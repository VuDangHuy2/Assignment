package managerment;

import java.util.Scanner;

public class EMP_FULLTIME extends EMPLOYEE{
    Scanner scan = new Scanner(System.in);

    private double coefficientsSalary;

    public EMP_FULLTIME() {
    }

    public EMP_FULLTIME(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }
    
    @Override
    public void input() {
        System.out.print("Enter ID:");
        this.setEmpID(scan.nextLine());
        System.out.print("Enter Name:");
        this.setEmpName(scan.nextLine());
        System.out.print("Enter date of birth:");
        String dob = scan.nextLine();
        try {
            this.setEmpDateOfBirth(sdf.parse(dob));
        } catch (Exception e) {
            System.out.println("Wrong!");
        }
        System.out.print("Enter start date:");
        String sd = scan.nextLine();
        try {
            this.setStartDate(sdf.parse(sd));
        } catch (Exception e) {
            System.out.println("Wrong!");
        }
        System.out.print("Enter coefficients salary:");
        this.setCoefficientsSalary(scan.nextDouble());
    }

    @Override
    public void output() {
        System.out.println("ID: " + this.getEmpID() + "\nName: " + this.getEmpName() + "\nDate of birth: " + sdf.format(this.getEmpDateOfBirth()) + "\nStart date: " + sdf.format(this.getStartDate())+"\nCoefficient salary: "+this.getCoefficientsSalary()+"\nSalary: "+this.CalculateSalary());
    }

    @Override
    public double CalculateSalary() {
        double Salary = BASIC_SALARY * this.getCoefficientsSalary() + this.CalculateAllowance();
        return Salary;
    }

    @Override
    public double CalculateAllowance() {
        int Allowance = 500000;
        if(this.CalculateSeniority()>=10){
            Allowance = 1000000;
        }
        return Allowance;
    }
    
}
