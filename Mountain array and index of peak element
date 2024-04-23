This is the leetcode problem and here is the description

# An array arr is a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

#solution

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result = i + 1;
            }e 
        }
        return result;
    }
}

public class Mountain {
    public static void  main(String [] args){
        int arr [] = {0,10,5,6};
        Solution obj = new Solution();
        System.out.print(obj.peakIndexInMountainArray(arr));
    }
  
}
