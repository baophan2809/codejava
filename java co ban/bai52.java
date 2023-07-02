import java.util.Scanner;

public class bai52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int i = 1;
        while (i <= n) {
            if (n % i == 0)
                count++;
            i++;
        }
        System.out.println(count);
        scan.close();
    }
}
