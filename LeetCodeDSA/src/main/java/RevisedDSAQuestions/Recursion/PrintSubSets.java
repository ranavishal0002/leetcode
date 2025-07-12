package RevisedDSAQuestions.Recursion;
import java.util.ArrayList;
public class PrintSubSets {
    public static ArrayList<ArrayList<Integer>> allSubSets(int arr[], int n){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer>current = new ArrayList<>();
        helper(arr, 0, result, current);
        return result;
    }
    static  void helper(int arr[], int index, ArrayList<ArrayList<Integer>>result, ArrayList<Integer>current){
       if(index> arr.length-1){
           result.add(new ArrayList<>(current));
           return;
       }
       // when we include the number
       current.add(arr[index]);
       helper(arr, index+1, result, current);

       // this is when we remove the number
        current.remove(current.size()-1);
        helper(arr, index+1, result, current);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        int n = arr.length;
        System.out.print(allSubSets(arr, n));
    }
}
