package RevisedDSAQuestions.Array;


public class BubbleSort {
    public static void sorting(int[] arr, int n ){
        for(int i =0; i<n-1; i++){
            boolean flag = false;  // this is used to check in sorted array so that can make early termination
            for(int j =0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    // if condition is true then swapping will be performed here
                    int tem= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= tem;
                    flag = true;
                }
            }
            if(flag==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,5,4};
        int n = arr.length;
        sorting(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
