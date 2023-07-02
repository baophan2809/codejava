import java.util.Scanner;

public class Bai39 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n >= 0 && n <= 10)
		System.out.print("The score is valid");
		else System.out.print("The score is not valid");
		scan.close();
	}
}