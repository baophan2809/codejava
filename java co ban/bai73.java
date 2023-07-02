import java.util.Scanner;

public class bai73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        for (char c = '0'; c <= '9'; c++)
            s = s.replace(c + "", "");
        System.out.println(s);
        scan.close();
    }
}