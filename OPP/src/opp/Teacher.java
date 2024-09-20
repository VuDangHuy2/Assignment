
package opp;

import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Teacher extends Person{
    Scanner scan = new Scanner(System.in);
    String departmet;
    String teachingSubject;

    public Teacher() {
    }

    public Teacher(String departmet, String teachingSubject) {
        this.departmet = departmet;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartmet() {
        return departmet;
    }

    public void setDepartmet(String departmet) {
        this.departmet = departmet;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
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
        System.out.print("Enter deparmet: ");
        this.departmet = scan.nextLine();
        System.out.print("Enter subject: ");
        this.teachingSubject = scan.nextLine();
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
        System.out.print("Enter deparmet: ");
        this.departmet = scan.nextLine();
        System.out.print("Enter subject: ");
        this.teachingSubject = scan.nextLine();
    }
    
    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println("ID: " + this.id + "\nName: " + this.fullName + "\nDate of birth: " + sdf.format(this.dateOfBirth) + "\nDeparmet: " + this.departmet + "\nSubject: " + this.teachingSubject);
    }
}
