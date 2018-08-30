
/**
 * Question 1:
 * Write a method that takes an int [] as a parameter and sorts the array elements in ascending order.
 * For example, if an int array object has elements {8, 1000, -10, 76, 276}
 * and we pass it to the method, then method will correct the element order in the array as:
 * {-10, 8, 76, 276, 1000}.
 *
 * @author Udayan Khattry
 */

package question1;

/**
 * This method sorts the elements in the passed array.
 * It modifies the passed object so no need to return the sorted array object.
 *
 *
 */
public class Sorting {
 /*   public static void sortArray(int [] array) {
        *//*
         * There are various algorithms available for sorting. If you have studied Computer Science,
         * then you might have come across various such algorithms in "Algorithms and Data Structure" course.
         * But if you have not studied computer science, then you can google it.
         * In Java, you don't have to write sorting logic as it is a part of Java API
         * (Check Question 2 for details) but it may improve your logical skills.
         *
         * The sort routine we are using is called BubbleSort and it can be used
         * to sort when quantity of array elements is low.
         *//*

        int swap = 0;
        for(int i = 0; i < array.length - 1; i++) {

            // Loop through from 1st element to 2nd last element
            //when i = 0, j < arr.length - 1
            //when i = 1, j < arr.length - 2
            //when i = 2, j < arr.length - 3
            //After first iteration, last element in the array is the highest number
            //After second iteration, last 2 elements in the array are sorted in ascending order and so on
            for(int j = 0; j < (array.length - i - 1); j++) {
                if(array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }

    *//**
     * This method prints all the elements in an int array.
     *
     *//*
    public static void printIntArray(int [] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }*/


    public static void sortArray(int [] arr) {
        int swap = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < (arr.length - i - 1); j++) {
                if(arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    }

    public static void printArray(int [] arr) {
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
