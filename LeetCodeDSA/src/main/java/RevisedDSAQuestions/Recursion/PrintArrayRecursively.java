package RevisedDSAQuestions.Recursion;

public class PrintArrayRecursively {
    public static void PrintArray(int arr[], int n){

        helper(arr, n, 0);
    }
    public static void helper(int arr[],int n,  int idx){
        if(idx >n-1){
            return;
        }
        System.out.print(arr[idx]+" ");
         helper(arr, n, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        PrintArray(arr, n);
    }
}
