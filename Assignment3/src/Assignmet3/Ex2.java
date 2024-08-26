package Assignmet3;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter something: ");
        if (keyboard.hasNext()) {
            System.out.println("You entered a sting.");
        } else {
            System.out.println("You didn't entered any string.");
        }

    }
}
