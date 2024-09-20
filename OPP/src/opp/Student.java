package opp;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Student extends Person {
    Scanner scan = new Scanner(System.in);
    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
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

    @Override
    public void addPerson() {
        System.out.print("Enter id: ");
        this.id = scan.nextLine();
        System.out.print("Enter name: ");
        this.fullName = scan.nextLine();
        System.out.print("Enter date of birth: ");
        String dateOfBirthString = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.dateOfBirth = sdf.parse(dateOfBirthString);
        } catch (Exception e) {
            System.out.println("Wrong format!");
        }
        System.out.print("Enter GPA: ");
        this.gpa = scan.nextFloat();
        scan.nextLine();
        System.out.print("Enter major: ");
        this.major = scan.nextLine();

    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println("ID: " + this.id + "\nName: " + this.fullName + "\nDate of birth: " + sdf.format(this.dateOfBirth) + "\nGPA: " + this.gpa + "\nMajor: " + this.major);
    }

   
    @Override
    public void updatePerson(String id) {
        System.out.print("Enter name: ");
        this.fullName = scan.nextLine();
        System.out.print("Enter date of birth: ");
        String dateOfBirthString = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.dateOfBirth = sdf.parse(dateOfBirthString);
        } catch (Exception e) {
            System.out.println("Wrong format!");
        }
        System.out.print("Enter GPA: ");
        this.gpa = scan.nextFloat();
        scan.nextLine();
        System.out.print("Enter major: ");
        this.major = scan.nextLine();
    }

}
