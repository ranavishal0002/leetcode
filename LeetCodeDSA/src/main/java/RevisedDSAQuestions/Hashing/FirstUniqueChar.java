package RevisedDSAQuestions.Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void nonRepeatingChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer>entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        String str = "hleho";
        int n = str.length();
        nonRepeatingChar(str);
    }
}
