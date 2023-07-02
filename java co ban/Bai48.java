import java.util.Scanner;

public class Bai48 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int answer = 1; 
		for (int i = 1 ; i <= n; i++)
		    answer *= i;
		System.out.print(answer);
		scan.close();
	}
}