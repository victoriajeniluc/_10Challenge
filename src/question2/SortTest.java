/**
 * Question 2:
 * Same as Question 1.
 * java.util.Arrays class has various utility methods to work with Arrays.
 * Instead of writing your own logic to sort the passed int [] object in the method,
 * you have to use a method from java.util.Arrays class to solve it.
 *
 * @author Udayan Khattry
 */

package question2;

public class SortTest {
    public static void main(String[] args) {
        int [] arr = {8, 1000, -10, 76, 276, 1058, -2937};
        System.out.print("Before the sort: ");
        Sort.printArray(arr);


        // Arrays.sort(arr); //Sort the array using java.util.Arrays.sort(int []) method. -- this is what Udayan did instead of creating a separate file to sort the array like I did
        Sort.sortArray(arr);
        System.out.print("After the sort: ");
        Sort.printArray(arr);
    }
}
