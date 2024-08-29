package assignment7;


import java.util.Arrays;
import java.util.Scanner;

public class Assignment7 {

    public static float[] importData(float[] arrays, int n) {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arrays[i] = kb.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
       
        System.out.println(Arrays.toString(arrays));
    }

    public static float findMax2(float[] arrays) {
        float max = arrays[0];
        float max2 = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (max < arrays[i]) {
                max = arrays[i];
            }
        }
        for (int i = 1; i < arrays.length; i++) {
            if (max2 < arrays[i] && arrays[i] < max) {
                max2 = arrays[i];
            }
        }
        return max2;
    }

    public static float[] deleteOddNumber(float[] arrays) {
        int oddCount = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 1) {
                oddCount++;
            }
        }
        float[] newArrays = new float[arrays.length - oddCount];
        int j = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 1) {
                newArrays[j++] = arrays[i];
            }
        }
        return newArrays;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = kb.nextInt();
        float[] arrays = new float[n];
        arrays = importData(arrays, n);
        System.out.print("Mang da nhap la: ");
        printData(arrays);
        System.out.println("So lon thu 2 la:" + findMax2(arrays));
        arrays = deleteOddNumber(arrays);
        System.out.print("Mang sau khi xoa cac so le la: ");
        printData(arrays);
    }

}
