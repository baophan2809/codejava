import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        System.out.println("In 15 years, age of " + name + " will be " + (15 + age));
        scan.close();
    }
}
