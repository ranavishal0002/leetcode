package PracticeQuestions;

public class MissingPositiveInteger {
    public  static int findMissingNum(int arr[], int n){
        for(int i =0; i<n; i++){
            while(arr[i]>0 && arr[i]<=n && arr[arr[i]-1]!=arr[i]){
                //swapping here
                int temp = arr[i];
                arr[i]= arr[temp-1];
                arr[temp-1]= arr[i];
            }
        }
        for(int i =0; i<n; i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,-1};
        int n = arr.length;
        System.out.println(findMissingNum(arr,n));
    }
}
