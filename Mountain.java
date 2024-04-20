class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result = i + 1;
            }
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
