
public class selection {

    public static void sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int min = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[turn];
            arr[turn] = temp;
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