import java.util.Scanner;

public class bai75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String answer = "";
        for (int i = s.length() - 1; i >= 0; i--)
            answer += s.charAt(i);
        System.out.println(answer);
        scan.close();
    }
}
