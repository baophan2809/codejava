import java.util.Scanner;
public class Bai32{
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        if ( n % 2 == 1 )
        System.out.print("n is an odd number");
        else System.out.print("n is an even number");
        scan.close();
    }
}