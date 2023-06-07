package practice;

import java.util.Scanner;

public class w2_ex {
    public static void ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter square's side: ");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.println("*  ".repeat(s));
        }
    }
    public static void ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square's side: ");
        int s = sc.nextInt();
        System.out.println("*  ".repeat(s));
        for (int i = 0; i < s - 2; i++) {
            System.out.println("*  " + "   ".repeat(s - 2) + "*");
        }
        System.out.println("*  ".repeat(s));
    }
    public static boolean triangle_check(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {return false;}
    }
    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter triangle sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (triangle_check(a, b, c)) {
            if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
                System.out.println("Isosceles triangle");
            } else if (a == b && a == c) {
                System.out.println("Equilateral triangle");
            } else {
                System.out.println("Normal triangle");
            }
        }
        else {
            System.out.println("Not a triangle");
        }
    }
    public static void ex4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinate and radius of A: ");
        double xa = sc.nextDouble();
        double ya = sc.nextDouble();
        double ra = sc.nextDouble();
        System.out.println("Enter coordinate and radius of B: ");
        double xb = sc.nextDouble();
        double yb = sc.nextDouble();
        double rb = sc.nextDouble();
        double dis = ex4.distance(xa, ya, xb, yb);
        double rad_sum = ra + rb;
        double rad_dif = Math.abs(ra - rb);
        if (dis > rad_sum) {
            System.out.println("The circles do not overlap each other.");
        } else if (dis == rad_sum) {
            System.out.println("The circles tangent each other.");
        } else {
            if (dis < rad_dif) {
                System.out.println("One circle is inside another one.");
            } else {
                System.out.println("The circles overlap each other.");
            }
        }
    }
    public static void ex5() {
        int[] numbers = new int[10]; //list of counter
        System.out.println("The occurrence of random numbers: ");
        for (int i = 0; i < 100; i++) {
            int rand = (int) (Math.random() * 10); //generate a number
            numbers[rand] += 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("Numbers of %d: %d", i, numbers[i]);
            System.out.println();
        }
    }
    public static void ex6() {
        int house = 1000;
        int you = 100;
        int round = 1;
        System.out.printf("The house has %d$\nThe player has %d$\nTry your luck to win all the money of the house!", house, you);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        boolean play = true;
        while (house > 0 && you > 0 && play) {//condition for the game to start
            //taking bets
            System.out.println("Round " + round);
            System.out.print("How much do you want to bet? ");
            int bet = sc.nextInt();
            System.out.printf("You have bet %d$!", bet);
            System.out.println();
            System.out.print("Do you want to bet big or small? ");
            String choose = sc.next();
            //rolling dice
            int sum = 0;
            int[] dice = new int[3];
            for (int i = 0; i < 3; i++) {
                int rand = (int) (1 + Math.random() * 6);
                sum += rand;
                dice[i] = rand;
                System.out.printf("Roll %d: %d", i, rand);
                System.out.println();
            }
            System.out.println("The sum is: " + sum);
            //result
            if (dice[0] == dice[1] && dice[0] == dice[2]) {
                System.out.println("You lost!. The dice were all the same");
                System.out.printf("The house has %d$\nThe player has %d$\n", house += bet, you -= bet);
            } else if (choose.equals("big") && sum >= 11) {
                System.out.println("You choose big and won!");
                System.out.printf("The house has %d$\nThe player has %d$\n", house -= bet, you += bet);
            } else if (choose.equals("small") && sum < 11) {
                System.out.println("You choose small and won!");
                System.out.printf("The house has %d$\nThe player has %d$\n", house -= bet, you += bet);
            } else {
                System.out.println("You lost!");
                System.out.printf("The house has %d$\nThe player has %d$\n", house += bet, you -= bet);
            }
            round += 1;

            if (house <= 0 && play) {
                System.out.println("Congratulation! You won all the money!");
                break;
            }
            if (you <= 0 && play) {
                System.out.println("You lose all the money");
                break;
            }
            System.out.println("Do you still want to continue playing? (true/false)");
            play = sc.nextBoolean();
            if (!play) {
                System.out.printf("You decided to stop. \nThe house has %d$\nThe player has %d$\n", house, you);
            }
        }

    }

    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
        ex6();
    }
}
