package RevisedDSAQuestions.Hashing;

import java.net.Inet4Address;
import java.util.HashMap;

public class FirstElementOccurKTimes {

    public static void firstElementToOccurKTimes(int arr[], int n, int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num)==k){
                System.out.println(num);
                return;
            }
            }

        System.out.println(-1);
    }
    public static void main(String[] args) {
        int arr[] = {1 ,7 ,4, 3, 4 ,8,7};
        int n = arr.length;
        int  k = 2;
        firstElementToOccurKTimes(arr, n, k);
    }
}
