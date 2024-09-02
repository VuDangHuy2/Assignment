package assignment8;

import static assignment8.Assignment8.findMax2;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        String c;

        do {
            System.out.println("1.Nhap data.");
            System.out.println("2.Xuat data.");
            System.out.println("3.Tim so lon thu 2 trong data.");
            System.out.println("4.Loai bo cac so le trong data.");
            System.out.print("Lua chon cua ban la: ");
            int n = kb.nextInt();
            switch (n) {
                case 1:
                    arr = Assignment8.importData();
                    break;
                case 2:
                    Assignment8.printData(arr);
                    break;
                case 3:
                    
                    System.out.println("So lon thu 2 la:" + Assignment8.findMax2(arr));
                    break;
                case 4:
                    Assignment8.deleteOddNumber(arr);
                    System.out.print("Mang sau khi xoa cac so le la: ");
                    Assignment8.printData(arr);
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
            System.out.println("Ban co muon tiep tuc khong(y/n)?");
            c = kb.next();
        } while (c.equals("y"));
    }
}
