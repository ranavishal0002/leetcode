package RevisedDSAQuestions.Array;

import java.io.PrintStream;

public class SortedInsertedPosition {
    public static int findPosition(int arr[], int  n, int b){
        int si = 0;
        int ei = n-1;
        int ans =0;
         while(si<=ei){
             int mid = si +(ei-si)/2;
             if(arr[mid]==b){
                 ans = mid;
                 break;
             }
             else if(arr[mid]<b){
                 ans = mid+1;
                 si= mid+1;
             } else{
                 ei= mid-1;
             }
         }
         return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
         int n = arr.length;
         int b = 4;
        System.out.print(findPosition(arr, n,b));
    }
}
