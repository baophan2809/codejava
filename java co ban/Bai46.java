import java.util.Scanner;

public class Bai46 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum = 0;
		for (int i = 0; i <=a; i++)
		    if (i % 2 == 1)
		        sum += i;
		System.out.print(sum);
		scan.close();
	}
}