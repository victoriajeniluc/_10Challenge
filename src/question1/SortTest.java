/**
 * Question 1: Test class.
 *
 * @author Udayan Khattry
 */
package question1;

public class SortTest {
    public static void main(String[] args) {
        int [] arr = {8, 1000, -10, 76, 276, -876, 0, 19}; //Create an int array object.
        System.out.print("Array before sorting; ");
        Sorting.printArray(arr); //Print the array contents

        Sorting.sortArray(arr); //Sort the array

        System.out.print("Array after sorting; ");
        Sorting.printArray(arr); //Print the array contents
    }
}
