import java.util.Scanner;

public class Bai36 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a != 0 && b != 0)
		System.out.print("a is not equal to 0 and b is not equal to 0");
		else System.out.print("a is equal to 0 or b is equal to 0");
		scan.close();
	}
}