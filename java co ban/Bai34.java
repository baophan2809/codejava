import java.util.Scanner;

public class Bai34 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a >= b)
        System.out.print("a is greater than or equal to b");
        else 
        System.out.print("a is smaller than b");
        scan.close();
    }
}