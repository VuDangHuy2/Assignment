
package lecture.pkg4.pkg5;

import java.util.Scanner;

public class switchcase {

    
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Input n: ");
        int n= kb.nextInt();
        switch(n){
            case 5: System.out.print("Five \n");break;
            case 4: System.out.print("Four \n");break;
            case 3: System.out.print("Three \n");break;
            case 2: System.out.print("Two \n");break;
            case 1: System.out.print("One \n");break;
            default: System.out.print("N/A \n");
        }
    }
    
}
