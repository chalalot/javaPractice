package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class test {


    public static void main(String[] args) {
        //list to be sorted
        List<Integer> num = new ArrayList<>(Arrays.asList(6,76,4,7,4,8,2,9,467,9,34,87,54,25,3456,3456,2,78,2,8,4,1));
        // sorted empty list
        List<Integer> sorted = new ArrayList<>();
        List<Integer> copy = new ArrayList<>(num); // a copy of num for iteration
        System.out.println(copy.size());
        for (int i = 0; i < num.size(); i++) { //for each number of
            int min = copy.get(0);
            int minIndex = 0;
            for (int j = 0; j < copy.size(); j++) {
                if (copy.get(j) < min) {
                    min = copy.get(j);
                    minIndex = j;
                }
            }
            sorted.add(min);
            copy.remove(minIndex);
        }
        System.out.println(num);
        System.out.println(sorted);

    }
}

