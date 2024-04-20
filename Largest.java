
class LargestInteger{
    public int biggestvalue(int []arr, int n ) {
        int largevalue = arr[0];
        for(int i =0; i<n; i++){
            if(arr[i]>largevalue){
                largevalue = arr[i];
            }
        }
        return largevalue;


    }
}
public class Largest {
 public static void main(String[] args){
    int arr[] = {3,2,1,9,2};
    int n = arr.length;
    LargestInteger largest = new LargestInteger();

    System.out.println("The largest integer of the given array is " + largest.biggestvalue(arr, n));

 }   
}
