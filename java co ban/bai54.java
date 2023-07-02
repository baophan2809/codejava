import java.util.Scanner;

public class bai54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        while (a <= b) {
            if (a % 3 == 0 && a % 5 == 0)
                System.out.print(a + " ");
            a++;
        }
        scan.close();
    }
}
