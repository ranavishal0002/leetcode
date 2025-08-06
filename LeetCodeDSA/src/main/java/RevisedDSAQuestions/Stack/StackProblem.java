package RevisedDSAQuestions.Stack;

import java.util.*;

class  StackProblem {
    public static int[] nextGreaterElements(int[] nums, int n ) {
        int res[] = new int[n];

    // fill all the array with -1
        for(int i =0; i<n; i++){
            res[i] = -1;
        }
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];

            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            if (i < n) {
                if (!st.isEmpty()) {
                    res[i] = st.peek();
                }
            }

            st.push(curr);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,3,8,2,6};
        int n= arr.length;

        System.out.print(Arrays.toString(nextGreaterElements(arr,n)));

    }

}
