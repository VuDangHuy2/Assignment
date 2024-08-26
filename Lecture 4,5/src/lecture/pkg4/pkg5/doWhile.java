package lecture.pkg4.pkg5;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String phrase;
        do{
            System.out.print("Type your password: ");
            phrase = console.next();
        }while (!phrase.equals("duytan"));
    }
}
