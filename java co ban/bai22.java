import java.util.Scanner;

public class bai22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String address = scan.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        scan.close();
    }
}
