package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class w3_ex6 {
    // needed information:
    // id number (generated randomly)
    // number of items
    // name, price of each item
    // total of how many items
    // average cost
    public static double average(List<Double> price) {
        double sum = 0;
        for (double i: price) {
            sum += i;
        }
        return sum / price.size();
    }
    public static void main(String[] args) {
        //take input
        //list of item name, price
        List<String> name = new ArrayList<>();
        List<Double> price = new ArrayList<>();
        //while not done: receive inputs
        Scanner sc = new Scanner(System.in);
        String input;
        //generate a random ID
        int id = (int) (100000 + Math.random() * 999999);
        while (true) {
            System.out.println("Enter item name and its price: ");//append inputs to list
            input = sc.next();
            if (input.equals("done")) {
                break;
            }
            name.add(input);
            price.add(sc.nextDouble());
        }
        System.out.println("You have a new order with ID: " + id);
        System.out.printf("In the order, you have %d items", name.size());
        System.out.println();
        System.out.println("The average spending is: " + average(price));
    }
}
