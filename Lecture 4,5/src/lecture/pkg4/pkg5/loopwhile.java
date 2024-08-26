package lecture.pkg4.pkg5;

import java.util.Scanner;

public class loopwhile {

    public static void main(String[] args) {
//        slide 19
        int num = 1;
        while (num <= 200) {
            System.out.print(num + " ");
            num = num * 2;
        }
        System.out.println("");
//       slide 25
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (-1 to quit): ");
        int number = console.nextInt();
        while (number != -1){
            sum = sum + number;
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
        }
        System.out.println("The total is " + sum);
    }
}
