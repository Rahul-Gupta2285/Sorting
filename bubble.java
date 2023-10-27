public class bubble {

    // Time complexity of this program is O(n2)

    public static void swap(int arr[], int a, int b) {
        arr[a] += arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] -= arr[b];
    }

    // bubble sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}