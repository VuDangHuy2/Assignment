package assignment2;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        int a = keyboard.nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b = keyboard.nextInt();
        System.out.println("Cong hai so: " + (a+b));
        System.out.println("Tru hai so: " + (a-b));
        System.out.println("Nhan hai so: " + (a*b));
        System.out.println("Chia hai so: " + (a/b));
        System.out.println("Chia lay phan du: " + (a%b));
    }
    
}
