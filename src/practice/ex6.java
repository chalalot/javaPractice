package practice;

import java.util.Scanner;

public class ex6 {
    public static void func(int n){
        if (n % 30 == 0) {
            System.out.printf("%d is divisible by both 5 and 6", n);
        } else if (n % 5 == 0 ^ n % 6 == 0) {
            System.out.printf("%d is divisible by 5 or 6, but not both", n);
        } else {
            System.out.printf("%d is neither divisible by 5 or 6", n);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a positive integer: ");
            n = sc.nextInt();
            func(n);
        } while (n > 0);
        if (n <= 0) {
            System.out.println("Goodbye!");

        }
    }
}
