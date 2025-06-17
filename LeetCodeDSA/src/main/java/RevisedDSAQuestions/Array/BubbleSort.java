package RevisedDSAQuestions.Array;


public class BubbleSort {
    public static void sorting(int[] arr, int n ){
        for(int i =0; i<n-1; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= tem;
                    flag= true;
                }
            }
            if(flag==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,5,4};
        int n = arr.length;
        sorting(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
