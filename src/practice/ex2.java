package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class ex2 {
    public static List<Double> swap(double a, double b) {
        return Arrays.asList(b, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        swap(a, b);
    }
}
