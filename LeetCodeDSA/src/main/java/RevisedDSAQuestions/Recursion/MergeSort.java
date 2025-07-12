package RevisedDSAQuestions.Recursion;

public class MergeSort {
    public static void divideArray(int[] arr, int start, int end){
      if(start>=end){
          return;
      }
      int mid = start+ (end-start)/2;
      divideArray(arr, start, mid);
      divideArray(arr, mid+1, end);
      conquer(arr, start, mid, end);
    }
    public static void conquer(int arr[], int start, int mid, int end){
        // declare an array to get the sorted array
       int mergedArray[] = new int[end-start+1];
       int idx1= start;
       int idx2= mid+1;
       int x = 0; //iterate mergedArray

       while(idx1 <=mid && idx2 <=end){
           if(arr[idx1]<= arr[idx2]){
               mergedArray[x]=arr[idx1];
               x++;
               idx1++;
           } else {
               mergedArray[x] = arr[idx2];
               x++;
               idx2++;
           }
       }
       while(idx1 <=mid){
           mergedArray[x]= arr[idx1];
           x++;
           idx1++;
       }
       while(idx2<= end){
           mergedArray[x]= arr[idx2];
           x++;
           idx2++;
       }
       for(int i=0; i<mergedArray.length; i++){
           arr[start+i] = mergedArray[i];
       }
    }
    public static void main(String[] args) {
        int arr[] = {2,1,8,6,4,3};
        int n = arr.length;
        divideArray(arr, 0, n-1);
        // Print Array
        for(int i=0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
