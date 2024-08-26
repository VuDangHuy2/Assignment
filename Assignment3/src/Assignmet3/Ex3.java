package Assignmet3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter something: ");
        if (keyboard.hasNextInt()) {
            System.out.println("You entered an interger.");
        } else {
            System.out.println("You didn't entered interger.");
        }
    }
}
