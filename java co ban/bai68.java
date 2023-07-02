import java.util.Scanner;

public class bai68 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int c = scan.nextInt();
        int[][] arr = new int[h][c];
        int answer = 0;
        for (int i = 0; i < h; i++)
            for (int k = 0; k < c; k++) {
                arr[i][k] = scan.nextInt();
                if (arr[i][k] % 5 == 0)
                    answer += arr[i][k];
            }
        System.out.println(answer);
        scan.close();
    }
}
