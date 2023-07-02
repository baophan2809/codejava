import java.util.Scanner;

public class Bai40 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a <= b && b <= c)
		System.out.print("increasing");
		else if (a >= b && b >= c)
		System.out.print("decreasing");
		else System.out.print("neither increasing nor decreasing order");
		scan.close();
	}
}