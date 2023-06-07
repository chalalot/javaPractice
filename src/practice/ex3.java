package practice;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter S: ");
        int s = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        while (s >= 0) {
            if (0 <= s && s < 60) {
                c += s;
                s -= s + 1;
            } else if (s >= 60 && s < 3600) {
                b += s / 60;
                s /= 60;
            } else if (s >= 3600) {
                a += s / 3600;
                s /= 60;
            }
        }
        System.out.println(a + ":" + b + ":" + c);
    }
}
