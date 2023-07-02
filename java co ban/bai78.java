import java.util.Scanner;

public class bai78 {
	public static void show(String [] hi) {
        for (int i = 0; i < hi.length; i++) {
            if (hi[i].length() > 3)
                System.out.print(hi[i] + " ");
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		show(arr);
        sc.close();
	}
}