package RevisedDSAQuestions.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RollNumberProblem {
    static  int [] requiredNumber(int arr[],int n){
        int totalSum= n*(n+1)/2;
        int currSum=0;
        for(int i =0; i<n; i++){
            currSum+=arr[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int duplicate = -1;
        for(int i=0; i<n; i++){
            int freq = map.getOrDefault(i,0);
            if(freq==2){
                duplicate=i;
            }
        }
        int missingNum = totalSum -(currSum-duplicate);
        return  new int[]{duplicate, missingNum};
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,2,4};
        int n = arr.length;
        System.out.print(Arrays.toString(requiredNumber(arr, n)));
    }
}
