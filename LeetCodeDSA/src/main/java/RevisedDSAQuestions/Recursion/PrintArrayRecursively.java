package RevisedDSAQuestions.Recursion;

public class PrintArrayRecursively {
    public static void PrintArray(int arr[], int n){
         helper(arr, n, 0);
    }
    public static void helper(int arr[], int n, int index){
        if(index>n-1){
            return;
        }
        System.out.print(arr[index]+" ");
        helper(arr, n, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        PrintArray(arr, n);
    }
}
