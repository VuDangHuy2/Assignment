package assignment4;

import java.util.Random;
import java.util.Scanner;

public class slide37_lecture5 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner scan = new Scanner(System.in);
        int point = 0;
        int wrong = 0;
        do{
            int sum = 0;
            int rand = rd.nextInt(4) + 2;
            for (int i = 1; i <= rand; i++) {
                int number = rd.nextInt(10) + 1;
                System.out.print(number);
                if (i<rand){
                    System.out.print(" + ");
                }else System.out.print(" = ");
                sum+=number;
            }
            int answer = scan.nextInt();
            if (answer == sum){
                point++;
            }
            else {
                System.out.println("Wrong! The answer is " + sum);
                 wrong++;
            }
        }while (wrong < 3);
        System.out.println("You earned " + point + " total points");
    }
}
