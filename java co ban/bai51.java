import java.util.Scanner;

public class bai51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n <= 100) {
            if (n % 2 == 0)
                System.out.print(n + " ");
            n++;
        }
        scan.close();
    }
}
