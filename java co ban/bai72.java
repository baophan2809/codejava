import java.util.Scanner;

public class bai72 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
		System.out.println(s1.indexOf(s2));
        scan.close();
	}
}