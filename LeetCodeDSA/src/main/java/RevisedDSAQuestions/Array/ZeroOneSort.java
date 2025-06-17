package RevisedDSAQuestions.Array;

import java.util.*;
class SortArray{
    public static int[] moveZeros(int arr[], int n){

        int countZero = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                countZero++;
            }
        }

        int resultArray [] = new int[n];
        for(int i=0; i<countZero; i++){
            resultArray[i]=0;
        }
        for(int i=countZero; i<n; i++){
            resultArray[i]=1;
        }
        return resultArray;
    }
}
public class ZeroOneSort {
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,1,1,1,0,1};
        int n= arr.length;
        System.out.println(Arrays.toString(SortArray.moveZeros(arr, n)));

    }
}
