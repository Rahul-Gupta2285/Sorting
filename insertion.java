
public class insertion {

    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int prev = i - 1;
            // finding out correct position to insert
            while (prev >= 0 && arr[prev] > temp) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = temp;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}