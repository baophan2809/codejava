import java.util.Scanner;

public class Bai33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n == 0)
		System.out.print("n is equal to 0");
		else if (n > 0)
		System.out.print("n is a positive number");
		else System.out.print("n is a negative number");
		scan.close();
	}
}