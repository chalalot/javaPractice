package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vietlot {
    public static void main(String[] args) {
        //take input
        Scanner sc = new Scanner(System.in);
        System.out.print("How many games do you want to play: ");
        int game = sc.nextInt();
        //divide path
        if (game == 1) {
            singlePlay();
        } else {
            multiPlay(game);
        }
    }

    public static void singlePlay() {
        Scanner sc = new Scanner(System.in);
        //picking or not
        System.out.println("Do you want to pick your own ticket numbers? ");
        String choose = sc.next();
        List<Integer> ticket = new ArrayList<>();
        List<Integer> win;
        //if pick
        if (choose.equals("yes")) {
            System.out.println("Enter 6 number of your ticket: ");
            int count = 0;
            while (count < 6) {
                int input = sc.nextInt();
                if (input > 45) {
                    System.out.println("The number must smaller than 45. Please enter again!");
                    count = 0;
                    ticket.clear();
                    continue;
                }
                ticket.add(input);
                count++;
            }
        } else {ticket = generate();} //else generated
        //finalizing the ticket
        System.out.print("You have chose the ticket: ");
        printTicket(ticket);
        //generate a winning ticket
        win = generate();
        System.out.print("The winning ticket is: ");
        printTicket(win);
        //comparing tickets
        int count = comparing(ticket, win);
        //calculating winning money
        int winning = winning(count);
        if (count == 0) {
            System.out.println("Your ticket doesn't match with any of the lucky numbers!");
            System.out.println("Better luck next time!");
        } else {
            System.out.printf("Your ticket have matched %d number!", count);
            System.out.println();
            System.out.printf("You have won %d$", winning);
        }
    }
    public static void multiPlay(int game) {
        //init variables
        int toltalW = 0;
        int totalC = 10 * game;
        int won = 0;
        int jackpot = 0;
        //loop for number of games
        for (int i = 0; i < game; i++) {
            //initialize a ticket and a winning ticket
            List<Integer> ticket = generate();
            List<Integer> win = generate();
            //calculate winning money
            toltalW += winning(comparing(ticket,win));
            //counting wins
            if (comparing(ticket, win) != 0) {
                won ++;
            }
            if (comparing(ticket,win) == 6) {
                jackpot ++;
            }
        }
        //announcing outcomes
        System.out.println("The number of games won any money: " + won);
        System.out.println("The number of games matching all 6 numbers: " + jackpot);
        System.out.println("Total money won: " + toltalW);
        System.out.println("Total money cost: " + totalC);
        System.out.println("Profit/Loss (won/cost): " + (toltalW - totalC));
    }
    public static List<Integer> generate() {
        List<Integer> ticket = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            ticket.add((int) (Math.random() * 46));
        }
        return ticket;
    }
    public static void printTicket(List<Integer> ticket) {
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", ticket.get(i));
        }
        System.out.println();
    }
    public static int comparing(List<Integer> ticket, List<Integer> win) {
        //comparing tickets
        int count = 0;
        for (int i: ticket) {
            for (int j: win) {
                if (i == j) {
                    count ++;
                }
            }
        }
        return count;
    }
    public static int winning(int count) {
        return switch (count) {
            case 1, 2, 3 -> 30;
            case 4 -> 300;
            case 5 -> 10000;
            case 6 -> 12000000;
            default -> 0;
        };
    }
}

