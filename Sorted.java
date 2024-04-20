
class Checksort {
    public boolean isValid(int[] arr, int n) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>=arr[i-1]){

            } else {
                return false;
            }
        }
        return true;

    }
}


public class Sorted {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        Checksort srt = new Checksort();
        System.out.println("This array is sorted "+ srt.isValid(arr,n));
             
    }
}
