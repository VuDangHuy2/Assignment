package Lecture6;

import java.util.Arrays;


public class arr {

    public static void main(String[] args) {
        
        int numbers[] = new int[10];
        for (int i = 0; i < 8; i++) {
            numbers[i] = 2 * i;
            System.out.print(numbers[i] + " ");
        }
          System.out.println("");
          System.out.println(Arrays.toString(numbers));
    }
}
