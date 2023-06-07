package practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class draft {
    public static List<Integer> hi(int a, int b) {
        return Arrays.asList(b, a);
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numbers = new int[6];
            int count = 0;

            while (count < 6) {
                System.out.print("Enter an integer (not exceeding 49): ");
                int input = sc.nextInt();

                if (input > 49) {
                    System.out.println("Input exceeds 49. Restarting input process.");
                    count = 0; // Reset count to restart the input process
                    continue;  // Restart the loop immediately
                }

                numbers[count] = input;
                count++;
            }

            System.out.println("Numbers entered: ");
            for (int i = 0; i < count; i++) {
                System.out.println(numbers[i]);
            }
        }


}
