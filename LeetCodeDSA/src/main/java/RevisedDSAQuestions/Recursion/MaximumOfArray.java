package RevisedDSAQuestions.Recursion;

public class MaximumOfArray {
    public static int maxOfArr(int []arr, int n){
       return helper(arr,n, 0);
    }
    public static int helper(int arr[], int n , int index){

        // Base condition
       if(index> n-1){
           return 0;
       }
       int max = helper(arr, n, index+1);
       if(max< arr[index]) {
           max = arr[index];
       }
           return max;

    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,20,30,4};
        int n = arr.length;
        System.out.println(maxOfArr(arr,n));
    }
}

