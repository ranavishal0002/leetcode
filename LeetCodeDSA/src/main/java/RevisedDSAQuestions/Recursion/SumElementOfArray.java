package RevisedDSAQuestions.Recursion;

public class SumElementOfArray {
   public static int sumOfAllElement(int arr[], int n){
      return helper(arr, n, 0);
   }
   public static int helper(int arr[], int n, int index){
       if(n==0){
           return 0;
       }
       if(index> n-1){
           return 0;
       }
       int sum = helper(arr, n, index+1);
       return sum+ arr[index];
   }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        System.out.print(sumOfAllElement(arr, n));
    }
}
