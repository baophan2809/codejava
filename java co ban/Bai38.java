import java.util.Scanner;

public class Bai38 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n >= 10 && n <= 100)
		System.out.print(n + " is in the range [10, 100]");
		else System.out.print(n + " is not in the range [10, 100]");
		scan.close();
	}
}