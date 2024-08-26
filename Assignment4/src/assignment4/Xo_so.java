
package assignment4;

import java.util.Random;
import java.util.Scanner;


public class Xo_so {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter your number(1-100): ");
        int number = scan.nextInt();
        int luckyNumber = rand.nextInt(100) + 1;
        System.out.println("Lucky number is: " + luckyNumber);
        if (number == luckyNumber){
            System.out.println("Congratulate!");
        }
        else System.out.println("Good luck next time!");
        
    }
    
}
