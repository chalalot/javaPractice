package practice;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        final double conv = 1.609;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of kilometers: ");
        int km = sc.nextInt();
        System.out.println("Km\tMiles");
        for (int i = km; i >= 1; i--) {
            System.out.printf("%d\t%.2f", i, i * conv);
            System.out.println();
        }
    }
}
