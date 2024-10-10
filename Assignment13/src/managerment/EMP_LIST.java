package managerment;

import java.util.ArrayList;
import java.util.Scanner;

public class EMP_LIST {

    Scanner scan = new Scanner(System.in);
    ArrayList<EMPLOYEE> list;

    public EMP_LIST() {
    }

    public EMP_LIST(ArrayList<EMPLOYEE> list) {
        this.list = list;
    }

    public void addNew() {
        System.out.println("1.Enter for employee fulltime.");
        System.out.println("2.Enter for employee parttime.");
        int choice = scan.nextInt();
        switch (choice) {
            case 1: {
                System.out.print("Enter number employee want to add: ");
                int n = scan.nextInt();
                for (int i = 0; i < n; i++) {
                    EMP_FULLTIME empFull = new EMP_FULLTIME();
                    empFull.input();
                    list.add(empFull);
                }
            }
            break;
            case 2: {
                System.out.print("Enter number employee want to add: ");
                int n = scan.nextInt();
                for (int i = 0; i < n; i++) {
                    EMP_PARTTIME empPart = new EMP_PARTTIME();
                    empPart.input();
                    list.add(empPart);
                }
            }
        }
    }

    public void update(String id) {
        for (EMPLOYEE emp : list) {
            if (emp.getEmpID().equals(id)) {
                emp.input();
            }
        }
    }

    public void find(String empId) {
        for (EMPLOYEE emp : list) {
            if (emp.getEmpID().equals(empId)) {
                emp.output();
            }
        }
    }

    public void delete(String empId) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmpID().equals(empId)) {
                list.remove(i);
            }
        }
    }

    public void Menu() {
        System.out.println("EMPLOYEE FULLTIME:");
        for (EMPLOYEE emp : list) {
            if (emp instanceof EMP_FULLTIME) {
                emp.output();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
        System.out.println("EMPLOYEE PARTTIME:");
        for (EMPLOYEE emp : list) {
            if (emp instanceof EMP_PARTTIME) {
                emp.output();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }
}
