package question2;

public class SortTest {
    public static void main(String[] args) {
        int [] arr = {8, 1000, -10, 76, 276, 1058, -2937};
        System.out.print("Before the sort: ");
        Sort.printArray(arr);

        Sort.sortArray(arr);
        System.out.print("After the sort: ");
        Sort.printArray(arr);
    }
}
