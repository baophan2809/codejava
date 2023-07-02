import java.util.Scanner;

public class Bai35 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		if (a.equals(b))
		System.out.print("two people have the same name");
		else 
		System.out.print("two people don't have the same name");
		scan.close();
	}
}