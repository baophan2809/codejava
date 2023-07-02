import java.util.Scanner;

public class bai64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1 && arr[i] > 0)
                answer += arr[i];
        }
        System.out.println(answer);
        scan.close();
    }
}
