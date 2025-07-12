package PracticeQuestions;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int n = nums.length;
        boolean ans = false;
        int i =0, j=1;
        while (i<n){
            while(j<n){
                if((Math.abs(i-j)<=indexDiff) && (Math.abs(nums[i]-nums[j])<= valueDiff)){
                    ans = true;
                    break;
                }
                else {
                    j++;
                }
                i++;
            }
        }

        return ans;
    }
}




public class Question1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 1};
        int indexDiff = 3;
        int valueDiff = 0;
        boolean result = sol.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        System.out.print(result);
    }
}