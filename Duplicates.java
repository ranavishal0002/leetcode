
class Removeduplicates {
    public int duplicatesremove(int[]arr, int n){

        int i =0;
        for(int j=1; j<n; j++){
            if(arr[i]!= arr[j]){
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i+1;

    }
}

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,3,4};
        int n = arr.length;
        Removeduplicates removed = new Removeduplicates();
        System.out.println(removed.duplicatesremove(arr, n));; 
    }
}
