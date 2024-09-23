package midterm_vudanghuy_3974;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Student extends Person {

    Scanner scan = new Scanner(System.in);
    private float gpa;
    private String major;
    private double tuiition;
    private boolean schoolarship;

    public Student() {
    }

    public Student(float gpa, String major, double tuiition, boolean schoolarship) {
        this.gpa = gpa;
        this.major = major;
        this.tuiition = tuiition;
        this.schoolarship = schoolarship;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuiition() {
        return tuiition;
    }

    public void setTuiition(double tuiition) {
        this.tuiition = tuiition;
    }

    public boolean isSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(boolean schoolarship) {
        this.schoolarship = schoolarship;
    }

    public void addStudent() {
        System.out.print("Enter id:");
        this.setId(scan.nextLine());
        System.out.print("Enter name:");
        this.setFullName(scan.nextLine());
        System.out.println("Enter date of birth:");
        String dateOfBirth = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.setDateOfBirth(sdf.parse(dateOfBirth));
        } catch (Exception e) {
            System.out.println("Wrong fomat!");
        }
        System.out.print("Enter GPA: ");
        this.setGpa(scan.nextFloat());
        System.out.print("Enter major: ");
        this.setMajor(scan.nextLine());
        if (this.getGpa() >= 9) {
            this.setSchoolarship(true);
        }
    }

    public double caculateTuiition() {
        if (this.schoolarship = true) {
            this.tuiition = 10000000 / 2;
        }
        return this.tuiition;
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + this.getId() + "\nName: " + this.getFullName() + "\nDate of birth: " + sdf.format(getDateOfBirth()) + "\nGPA: " + this.getGpa() + "\nMajor: " + this.getMajor() + "\nTuiition: " + this.getTuiition() + "\nSchoolarship: " + this.isSchoolarship());
    }

}
