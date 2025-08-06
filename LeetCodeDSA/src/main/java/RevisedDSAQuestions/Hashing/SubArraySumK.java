package RevisedDSAQuestions.Hashing;

import java.util.HashMap;

public class SubArraySumK {
    static int totalSubArray(int arr[], int n , int K){

        // <sum, frequency> we are storing here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1); // initially sum is 0 and its freq is 1

        int count = 0;
        int currSum =0;
        for(int i=0; i<n; i++){
            currSum+=arr[i]; // this is update the currSum everytime when we increase the i

            if(map.containsKey(currSum-K)){
                count+= map.get(currSum-K);
            }
            map.put(currSum, map.getOrDefault(currSum,0)+1);
        }
        return count;


    }
    public static void main(String[] args) {
        int arr[] = {4,5,0,-2,-3,1};
        int n = arr.length;
        int K = 5;
        System.out.println(totalSubArray(arr,n,K));

    }
}
