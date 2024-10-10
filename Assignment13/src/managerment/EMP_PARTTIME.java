package managerment;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EMP_PARTTIME extends EMPLOYEE {

    Scanner scan = new Scanner(System.in);
    private int numberOfWorkdays;

    public EMP_PARTTIME(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public EMP_PARTTIME() {
    }

    public int getNumberOfWorkdays() {
        return numberOfWorkdays;
    }

    public void setNumberOfWorkdays(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
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
        System.out.print("Enter number of workdays:");
        this.setNumberOfWorkdays(scan.nextInt());
    }

    @Override
    public void output() {
        System.out.println("ID: " + this.getEmpID() + "\nName: " + this.getEmpName() + "\nDate of birth: " + sdf.format(this.getEmpDateOfBirth()) + "\nStart date: " + sdf.format(this.getStartDate())+"\nNumber of workdays: "+this.getNumberOfWorkdays()+"\nSalary: "+this.CalculateSalary());
    }

    @Override
    public double CalculateSalary() {
        double Salary = BASIC_SALARY * this.getNumberOfWorkdays()/26+ this.CalculateAllowance();
        return Salary;
    }

    @Override
    public double CalculateAllowance() {
        int Allowance = 300000;
        if(this.CalculateSeniority()>=10){
            Allowance = 500000;
        }
        return Allowance;
    }
    

}
