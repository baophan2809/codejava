import java.util.Scanner;

public class Bai37 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a >= b && a >= c)
		System.out.print(a);
		else if (b >= c && b >= a)
		System.out.print(b);
		else System.out.print(c);
		scan.close();
	}
}