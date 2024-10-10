package managerment;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EMP_LIST list = new EMP_LIST(new ArrayList<>());
        int choice;
        do {
            System.out.println("1.AddNew");
            System.out.println("2.Update information of emplyee based on EmpID");
            System.out.println("3.Delete an employee based on EmpID");
            System.out.println("4.Find an employee based on EmpID");
            System.out.println("5.Show list of employee");
            System.out.println("0.Exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    list.addNew();
                }
                break;
                case 2: {
                    scan.nextLine();
                    System.out.print("Enter id:");
                    String empID = scan.nextLine();
                    list.update(empID);
                }
                break;
                case 3: {
                    scan.nextLine();
                    System.out.print("Enter id:");
                    String empID = scan.nextLine();
                    list.delete(empID);
                }
                break;
                case 4: {
                    scan.nextLine();
                    System.out.print("Enter id:");
                    String empID = scan.nextLine();
                    list.find(empID);
                }
                break;
                case 5: {
                    list.Menu();
                }
                break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong!");
            }
        } while (choice != 0);
    }
}
