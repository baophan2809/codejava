import java.util.Scanner;

public class bai67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        int answer = 0;
        for (int i = 0; i < n; i++)
            for (int k = 0; k < m; k++) {
                arr[i][k] = scan.nextInt();
                answer += arr[i][k];
            }
        System.out.println(answer);
        scan.close();
    }
}
