import java.util.Scanner;

public class bai69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();
        System.out.print(s.charAt(k - 1));
        scan.close();
    }
}
