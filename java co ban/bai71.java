import java.util.Scanner;

public class bai71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char k = scan.next().charAt(0);
        int count = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == k) {
                count = i;
                break;
            }
        }
        System.out.println(count);
        scan.close();
    }
}
