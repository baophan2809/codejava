import java.util.Scanner;

public class Bai41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > 0 && y > 0)
        System.out.print("This point lies in the First quadrant");
        else if (x < 0 && y > 0)
        System.out.print("This point lies in the Second quadrant");
        else if (x < 0 && y < 0)
        System.out.print("This point lies in the Third quadrant");
        else System.out.print("This point lies in the Fourth quadrant");
        scanner.close();
    }
}