package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class w3_ex {
    public static List<Integer> ex1(int N){
        // ask for N
        List<Integer> num = new ArrayList<>();
        // create array, store arrays
        // generate N numbers
        for (int i = 0; i < N; i++) {
            num.add((int) (Math.random() * N+1));
        }
        // return result
        return num;
    }
    public static int ex2(List<Integer> numbers) {
        //get min
        int min = 10000;
        int index = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
                index = i;
            }
        }
        //return index of min
        return index;
    }
    public static int ex2_min(List<Integer> numbers) {
        //get min
        int min = 10000;
        for (int i: numbers) {
            if (i < min) {
                min = i;
            }
        }
        //return min
        return min;
    }
    public static int ex3(List<Integer> numbers, int from) {
        //get min
        int min = 10000;
        int index = 0;
        for (int i = from; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
                index = i;
            }
        }
        //return index of min
        return index;
    }
    public static int ex3_min(List<Integer> numbers, int from) {
        //get min
        int min = 10000;
        for (int i = from; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        //return min
        return min;
    }
    public static List<Integer> ex4(int from, List<Integer> numbers) {
        int index = ex3(numbers, from);
        int temp = numbers.get(index);
        numbers.set(index, numbers.get(from));
        numbers.set(from, temp);
        return numbers;
    }
    public static List<Integer> sortBySelection(List<Integer> num) {
        List<Integer> list = new ArrayList<>(num);
        // sorted empty list
        List<Integer> sorted = new ArrayList<>();
        List<Integer> copy = new ArrayList<>(list); // a copy of num for iteration
        for (int i = 0; i < num.size(); i++) { //for each element in the list, there are places for sorted to be inserted
            int min = copy.get(0); //declare min in the loop so that it get reset after each append
            int minIndex = 0;//index for start of finding min iteration
            for (int j = 0; j < copy.size(); j++) {//looping using the copied list that got removed at the end
                if (copy.get(j) < min) {
                    min = copy.get(j);//get min
                    minIndex = j;//index for identifier of min
                }
            }
            sorted.add(min);//append accordingly to the sorted list
            copy.remove(minIndex);//remove the min that have just been found using its index
        }
        return sorted;
    }
    public static void main(String[] args) {
        //ex1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many random numbers to generate: ");
        int N = sc.nextInt();
        System.out.println("Generated random numbers are: ");
        List<Integer> num = ex1(N);
        for (int i: num) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        // ex2
        System.out.printf("The smallest number is %d at index %d", ex2_min(num), ex2(num));
        //ex3
        System.out.println();
        System.out.println("Where do you want to find min from: ");
        int from = sc.nextInt();
        System.out.printf("The smallest number from index %d is %d at index %d", from, ex3_min(num, from), ex3(num, from));
        // ex4
        System.out.println();
        System.out.println("The new array after exchange is: ");
        for (int i: ex4(from, num)) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The sorted array is: ");
        for (int i: sortBySelection(num)) {
            System.out.print(i + " ");
        }

    }
}
