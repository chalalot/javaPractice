package practice;

import java.util.Scanner;

public class w1_ex {
    public static void stars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = input.nextLine();
        stars(name.length() + 4);
        System.out.println();
        System.out.println( "* " + name + " *");
        stars(name.length() + 4);
    }
}
