import java.util.Scanner;

public class bai29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;
        double r = scan.nextDouble();
        System.out.println("Circumference = " + (pi * r * 2)); 
        scan.close();   
    }
}
