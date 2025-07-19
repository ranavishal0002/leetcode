package RevisedDSAQuestions.BinarySearch;

public class PeakIndex {
    public static int findIndex(int arr[], int n){
        int si =1;
        int ei= arr.length-2;
        while (si<=ei){
            int mid = si + (ei-si)/2;
            if(arr[mid]> arr[mid+1] && arr[mid]> arr[mid-1]){
                return mid;
            }
            if(arr[mid]< arr[mid+1]){
                si = mid+1;
            }
            else {
                ei = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;

        System.out.println(findIndex(arr, n));

    }
}
