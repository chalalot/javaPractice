package practice;

import java.util.Map;
import java.util.Scanner;

public class ex4 {
    public static double distance(double a, double b, double c, double d) {
        double sqrx = Math.pow(a - c, 2);
        double sqry = Math.pow(b - d, 2);
        double dis = Math.sqrt(sqrx + sqry);
        return dis;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinate of A: ");
        int xa = sc.nextInt();
        int ya = sc.nextInt();
        System.out.println("Enter coordinate of B: ");
        int xb = sc.nextInt();
        int yb = sc.nextInt();
        System.out.println("Area: " + Math.pow(distance(xa, ya, xb, yb), 2));
        System.out.println("Circumference: " + distance(xa, ya, xb, yb) * 4);
    }
}
