import java.util.Scanner;

public class bai53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int answer = a;
        int i = 1;
        while (i < b) {
            answer *= a;
            i++;
        }
        System.out.println(answer);
        scan.close();
    }
}
