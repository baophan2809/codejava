import java.util.Scanner;

public class bai28 {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("after swapping, a = " + a + ", b = " + b);
        scan.close();
    }
}
