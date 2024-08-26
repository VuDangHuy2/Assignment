package Assignmet3;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = keyboard.nextLine();
        System.out.print("Enter age: ");
        int age = keyboard.nextInt();
        System.out.print("Enter year: ");
        int year = keyboard.nextInt();
        System.out.print("Enter sex: ");
        keyboard.nextLine();
        String sex = keyboard.nextLine();
        System.out.print("Enter major: ");
        String major = keyboard.nextLine();
        System.out.print("Enter GPA: ");
        float GPA = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.print("Enter hometown: ");
        String hometown = keyboard.nextLine();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Sex: " + sex);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("Hometown: " + hometown);
    }

}
