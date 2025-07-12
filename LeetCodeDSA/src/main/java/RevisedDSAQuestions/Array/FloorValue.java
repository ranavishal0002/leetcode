package RevisedDSAQuestions.Array;


// Floor value = equals to oor less than the target value.
import java.util.Scanner;

public class FloorValue {
    public static int findFloorVal(int[]arr, int n , int x){
        // here we can use binary search
        int start= 0;
        int end = n-1;
        int ans = -1;
         while(start<=end){
             int mid = start + (end-start)/2;
             if(arr[mid]==x){
                 return mid;
             }
             if(arr[mid]< x){
                 ans = arr[mid];
                 start = mid+1;
             }
             else {
                 end = mid-1;
             }
         }
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr ={1,5,8,11,18,20};
        int n = arr.length;
        int x = sc.nextInt();
        int results = (findFloorVal(arr, n, x));
        System.out.println(results);
    }
}
