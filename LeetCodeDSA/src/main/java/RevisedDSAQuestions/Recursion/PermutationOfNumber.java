package RevisedDSAQuestions.Recursion;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class PermutationOfNumber {
    public static List<List<Integer>> printPermutation(int arr[]){
        List<List<Integer>> result= new ArrayList<>();
        if(arr== null || arr.length ==0){
            return result;
        }
        permuteHelper(arr, 0, result);
        return result;
    }
    private static void permuteHelper(int arr[], int start, List<List<Integer>> result){
        if(start == arr.length-1) {
            List<Integer> currPerm = new ArrayList<>();

            for(int num : arr){
                currPerm.add(num);
            }
            result.add(currPerm);
            return;
        }
         // Recursive calls will start from here
        for(int i = start; i<arr.length; i++){
            swap(arr, start, i);
            permuteHelper(arr, start+1, result);
            swap(arr, start, i);
        }
        }
        private static void swap(int []arr, int i, int j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
        }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n = arr.length;
        int index=0;
        System.out.println(printPermutation(arr));

    }
}

//  This  is another way of printing Permutation of an Array without ArrayList

//public static void printPermutation(int arr[]) {
//    if (arr == null || arr.length == 0) return;
//    permuteHelper(arr, 0);
//}
//
//private static void permuteHelper(int arr[], int start) {
//    if (start == arr.length - 1) {
//        for (int num : arr) {
//            System.out.print(num);
//        }
//        System.out.println(); // move to next line
//        return;
//    }
//
//    for (int i = start; i < arr.length; i++) {
//        swap(arr, start, i);
//        permuteHelper(arr, start + 1);
//        swap(arr, start, i); // backtrack
//    }
//}
