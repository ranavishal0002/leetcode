package RevisedDSAQuestions.Hashing;

public class HingedElements {
    static int findElement(int arr[], int n){
        int leftMax[]= new int[n];
        int rightMin[] = new int[n];
        if(n==1){
            return -1;
        }

        //start filling leftMax Array

        leftMax[0]= arr[0];
        for(int i =1; i<n; i++){
            leftMax[i]= Math.max(leftMax[i-1], arr[i]);
        }

        //Start filling rightMin Array
        rightMin[n-1]= arr[n-1];
        for(int i =n-1; i>=0; i++){
            rightMin[i] =Math.min(rightMin[i+1], arr[i]);
        }

        // when all the elements are same
        if(leftMax[0]== rightMin[n-1]){
            return -1;
        }
        if(leftMax[n-1]== rightMin[n-1]){
            return n-1;
        }

        for(int i =1;i<n; i++){
            if(leftMax[i]== rightMin[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,6,8,9,7,10 };
        int n = arr.length;
        System.out.println(findElement(arr,n));
    }
}
