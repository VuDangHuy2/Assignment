package midterm_vudanghuy_3974;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        StudentList studentList = new StudentList(new ArrayList<>());

        int choice;
        do{
                
        System.out.println("1.Add a new student.");
        System.out.println("2.Delete student by ID.");
        System.out.println("3.Display all students.");
        System.out.println("4.Find the student with the highest GPA");
        System.out.println("5.Display the list of students with scholarships.");
        System.out.println("6.Display the total tuition fees of all students.");
        System.out.print("Please choice");
        choice = scan.nextInt();
        switch(choice){
            case 1: 
                studentList.addStudent();
                break;
            case 2:
                System.out.println("Enter id:");
                String id = scan.nextLine();
                studentList.deletedStudentById(id);
                break;
            case 3:
                studentList.displayAllStudent();
                break;
            case 4:
                System.out.println("Enter id:");
                id = scan.nextLine();
                studentList.findStudentById(id).displayInfo();
                break;
            case 5:
                studentList.findTopStudent().displayInfo();
                break;
            case 6:
                studentList.displayScholarShipStudents();
                break;
            case 7:
                System.out.println(studentList.caculateTuiitionOfAllStudents());
                break;
            default:
                System.out.println("Wrong!");
        }
    }while(choice!=0);
        }
}
