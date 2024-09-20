package opp;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList studentList = new PersonList(new ArrayList<>());
        int choice;

        do {
            System.out.println("====== MENU ======");
            System.out.println("1. Add student");
            System.out.println("2. Delete student by id");
            System.out.println("3. Find student by id");
            System.out.println("4. Diplay student list");
            System.out.println("5. Find top student");
            System.out.println("0. exit");
            System.out.print("Please choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentList.addStudent(new Student());
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Enter id of student you want to remove: ");
                    String id = scanner.nextLine();
                    studentList.deletePersonById(id);
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.print("Enter id of student you want to find: ");
                    id = scanner.nextLine();
                    studentList.findPersonByID(id);
                    break;
                case 4:
                    studentList.displayEveryone();
                    break;
                case 5:
                    System.out.println("Top student is:");
                    studentList.findTopStudent().displayInfo();
                    break;
                case 0:
                    System.out.println("Exit program.");
                    break;
                default:
                    System.out.println("Wrong! Try again.");
            }
        } while (choice != 0);

    }
}
