import java.util.Scanner;

public class bai80 {
	public static double circumference(double r) {
        double pi = 3.14;
        return pi * 2 * r;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.print(circumference(r));
        sc.close();
	}
}