public class MergeSort {

    static void merge(int arr[], int l, int m, int r) { 
        // Introduce two new arrays and give them size accordingly...and and then seperate left and right arrays and copy elements in them accordingly....
        int n1 = m - l + 1;
        int n2 = r - m;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i]; // Fix the type here.
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + i + 1]; // Fix the type here.
        }
//  From here onwards we start sorting both left and right arrays and merge them into one single array...
        int i = 0;
        int j = 0;
        int k = l; // impo. point to remember here 
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j]; 
            j++;
            k++;
        }
    }

    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 1, 2, 5, 40, 23, 21, 16 };
        int l = 0;
        int r = arr.length - 1; // Use the length of the array instead of a hard-coded value.
        mergeSort(arr, l, r);

        // Print the sorted array.
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
