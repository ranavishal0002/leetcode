package RevisedDSAQuestions.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindingAllDuplicates {
    public static void allDuplicates(int arr[], int n){
        ArrayList<Integer>list = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
        for(int i: list){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4 ,3, 2 ,7 ,8 ,2 ,3 ,1};
        int n = arr.length;
        allDuplicates(arr, n);
    }
}
