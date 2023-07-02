import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int width = scan.nextInt();
        System.out.println("Area = " + (length * width));
        scan.close();
    }
}
