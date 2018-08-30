/**
 * Same as Question 1. java.util.Arrays class has various utility methods to work with Arrays.
 * Instead of writing your own logic to sort the passed int [] object in the method, you have to use a
 * method from java.util.Arrays class to solve it.
 */

// package THEN import statement
package question2;
import java.util.Arrays;

public class Sort {
    public static void sortArray(int [] arr) {
        Arrays.sort(arr);
    }

    public static void printArray(int [] arr) {
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
