package RevisedDSAQuestions.Hashing;

import java.util.HashMap;

public class CreateHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer>map = new HashMap<>(); // this is to create HashMap

        // this is to insert elements in the  map
        map.put("vishal", 50);
        map.put("vikas", 60);
        map.put("diksha", 70);
        map.put("rohit", 80);

        // this is to print map
        System.out.println(map);

        // searching in map
//        System.out.println(map.containsValue(50));

        // Deletion in HashMap
        System.out.println(map.remove("vishal"));
        System.out.println(map);

        // print value of a key
        System.out.println(map.get("vikas"));

        // print all keyset
        System.out.println(map.keySet());


        // iterate over HashMap

        for(String key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
