package RevisedDSAQuestions.Recursion;

import java.util.Scanner;

public class FirstOccurence {
    public static int findFirstOccurence(int arr[], int n, int x){
         return helper(arr,0,x);
    }
    public static int helper(int arr[], int index, int target){
        if(index>arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return helper(arr, index+1, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,4,5,6};
        int n = arr.length;
        int x = sc.nextInt();
        System.out.println(findFirstOccurence(arr, n,x));
    }
}
