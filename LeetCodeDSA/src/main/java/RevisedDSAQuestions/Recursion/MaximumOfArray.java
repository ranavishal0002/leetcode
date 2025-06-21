package RevisedDSAQuestions.Recursion;

public class MaximumOfArray {
    public static int maxOfArr(int arr[], int n){
       return   helper(arr, 0);
    }
    public static int helper(int []arr, int idx ){
        if(idx> arr.length-1){
            return 0;
        }
        int max= helper(arr, idx+1);
        if(max< arr[idx]){
            max= arr[idx];
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,20,10,4};
        int n = arr.length;
        System.out.println(maxOfArr(arr,n));
    }
}
