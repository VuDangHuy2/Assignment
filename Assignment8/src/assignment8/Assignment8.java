package assignment8;

import java.util.ArrayList;

import java.util.Scanner;

public class Assignment8 {

    public static ArrayList<Integer> importData() {
        ArrayList<Integer> arrays = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " :");
            arrays.add(kb.nextInt());
        }

        return arrays;
    }

    public static void printData(ArrayList<Integer> arrays) {

        System.out.println(arrays);
    }

    public static int findMax2(ArrayList<Integer> arrays) {
        int max = arrays.get(0);
        int max2 = arrays.get(0);
        for (int i = 1; i < arrays.size(); i++) {
            if (max < arrays.get(i)) {
                max = arrays.get(i);
            }
        }
        for (int i = 1; i < arrays.size(); i++) {
            if (max2 < arrays.get(i) && arrays.get(i) < max) {
                max2 = arrays.get(i);
            }
        }
        return max2;
    }

    public static ArrayList<Integer> deleteOddNumber(ArrayList<Integer> arrays) {
        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i) % 2 != 0) {
                arrays.remove(i);
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrays = importData();
        System.out.print("Mang da nhap la: ");
        printData(arrays);
        System.out.println("So lon thu 2 la:" + findMax2(arrays));
        arrays = deleteOddNumber(arrays);
        System.out.print("Mang sau khi xoa cac so le la: ");
        printData(arrays);
    }
}
