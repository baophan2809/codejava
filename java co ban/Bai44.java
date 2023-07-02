import java.util.Scanner;

public class Bai44 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = n; i >= -n; i--)
		    System.out.print(i + " ");
		scan.close();
	}
}