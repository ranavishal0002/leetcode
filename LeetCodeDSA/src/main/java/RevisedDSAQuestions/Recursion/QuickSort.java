package RevisedDSAQuestions.Recursion;

public class QuickSort {
    public static int partition(int arr[], int low, int high){
        // pivot is always the last element of the array
        int pivot = arr[high];
        int i = low -1;
        for(int j =low; j< high; j++){
            if(arr[j]<pivot){
                i++;
                // swapping will be done here
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
        }
        // to find the correct position of the pivot element
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high]= temp;
        return i;
    }
    public static void sortQuick(int arr[], int low, int high){
        if(low<high){
            int pvtIndex = partition(arr, low, high);
            sortQuick(arr, low, pvtIndex-1);
            sortQuick(arr, pvtIndex+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[]= {9,1,8,2,7,3,6,5,4};
        int n = arr.length;
        sortQuick(arr, 0, n-1);
        // Print the Array
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
