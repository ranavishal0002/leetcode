class Checksubarray {
    public int size(int arr[], int n, int k) {
        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0; // Initialize sum for each subarray
            for (int j = i; j < n; j++) { // Fix the loop range from i to n
                sum += arr[j]; // Add current element to the sum
                if (sum == k) { // If sum matches target k
                   len = Math.max(len, j - i + 1); // Update len if current subarray is longer
                  // len++; // to find the number of subarrays havingsum equals to k
                }
            }
        }
        return len;
    }
}
public class SubArray {
    public static void main(String[] args) {
        int arr [] = {1,2,1,2,1};
        int n = arr.length;
        int k = 5;
        Checksubarray subarrays = new Checksubarray();
        System.out.println("the length of the longest subarray is "+subarrays.size(arr, n, k));
    }
}
