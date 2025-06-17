package RevisedDSAQuestions.Array;

public class SelectionSort {

    public static void sorting(int[] arr, int n) {

        // find the minIndex first
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4,2,7,1,3,9,6};
        int n = arr.length;
        sorting(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}