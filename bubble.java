
public class bubble {

    public static int sort(int arr[]) {
        int swaps = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    swaps++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1 };
        if (sort(arr) != 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("array is sorted");
        }

    }
}