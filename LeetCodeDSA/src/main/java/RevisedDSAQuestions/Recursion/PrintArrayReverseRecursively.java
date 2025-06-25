package RevisedDSAQuestions.Recursion;

public class PrintArrayReverseRecursively {
    public static void printReverseArray(int arr[], int n){
        helper(arr, n, n-1);
    }

    public static void helper(int arr[], int  n , int index){
        if(index<0){
            return;
        }
        System.out.print(arr[index]+" ");
        helper(arr, n, index-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n= arr.length;
        printReverseArray(arr, n);
    }
}
