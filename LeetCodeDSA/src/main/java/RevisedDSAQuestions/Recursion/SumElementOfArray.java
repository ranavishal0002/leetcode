package RevisedDSAQuestions.Recursion;

public class SumElementOfArray {
    public static int sumOfAllElement(int []arr, int n ){
        return helper(arr, 0);
    }
    public static int helper(int []arr, int idx){
        if(idx> arr.length-1){
            return 0;
        }
        int sum = helper(arr, idx+1);
        return sum +arr[idx];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        System.out.print(sumOfAllElement(arr, n));
    }
}
