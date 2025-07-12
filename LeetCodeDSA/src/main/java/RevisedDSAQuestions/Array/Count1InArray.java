package RevisedDSAQuestions.Array;

// Here we need to use Binary Search
public class Count1InArray {
    public static int countFunction(int arr[], int n){
        int si =0;
        int ei = n-1;
        int ans =-1;
        while (si<=ei){
            int mid= si +(ei-si)/2;
            if(arr[mid]==1){
                ans=mid;
                si= mid+1;
            } else{
                ei=mid-1;
            }
        }
        return ans+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,0,0,0};
        int n = arr.length;
        System.out.print(countFunction(arr,n));
    }
}
