import java.util.Scanner;

public class Bai43 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		for(int i = a; i <= b; i++)
		    System.out.print(i + " ");
		scan.close();
	}
}