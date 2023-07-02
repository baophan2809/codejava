import java.util.Scanner;

public class bai63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k)
                count++;
        }
        System.out.println(count);
        scan.close();
    }
}
