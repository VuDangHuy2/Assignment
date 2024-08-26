package lecture.pkg4.pkg5;

public class loopFor {
    public static void main(String[] args) {
        System.out.println("homer says:");
        for (int i = 1; i <= 4; i++) {
            System.out.println("I am so smart");
        }
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " squared = " + (i*i));
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
