import java.util.Scanner;

public class bai30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char cin = scan.next().charAt(0);
        System.out.println((char)(cin + 1));
        scan.close();
    }
}
