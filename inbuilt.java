
import java.util.Arrays;
import java.util.Collections;

// time complexity of inbuilt sort function is O(log N)

public class inbuilt {
    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2 }; primitive type varible
        Integer arr1[] = { 5, 4, 1, 3, 2 }; // object type varible
        // Arrays.sort(arr); // sort the whole array
        // Arrays.sort(arr, 0, 3); // sort only from 0 to 2
        Arrays.sort(arr1, Collections.reverseOrder());
        for (int item : arr1) {
            System.out.print(item + " ");
        }
        /*
         * Arrays.sort(arr1, 0, 3, Collections.reverseOrder()); // sort only from 0 to 2
         * in reverse order
         */
    }
}
