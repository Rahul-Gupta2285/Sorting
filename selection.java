public class selection {

    // Time complexity of this program is O(n2)

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            // finding the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // swap
            swap(arr, i, smallest);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        selectionSort(arr);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
