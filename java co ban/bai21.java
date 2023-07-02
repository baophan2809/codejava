import java.util.Scanner;
public class bai21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);
        scan.close();// tranh leak bo nho
    }
}
