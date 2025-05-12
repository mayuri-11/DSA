package HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void hashMapMethods(){
        //syntax
        Map <String, Integer> data = new HashMap<>();

        //Adding Elements
        data.put("one", 1);
        data.put("two", 2);
        data.put("three", 3);
        data.put("four", 4);
        data.put("five", 5);

        // Getting value of a key from Hashmap
        System.out.println(data.get("one")); // Output: 1

        //Changing value of a key in the Hashmap
        System.out.println(data.put("one", 10)); // 1 -> 10

        //Removing a pair of Hashmap
        System.out.println(data.remove("two"));

        // Checking if key is in the HashMap
        System.out.println(data.containsKey("four")); // true

        //Adding a new entry only if the new key doesn`t exist already
        System.out.println(data.putIfAbsent("six", 6)); //

        //Get all keys in the Hashmap
        System.out.println(data.keySet()); // [one, three, four, five, six]

        //Get all values in the Hashmap
        System.out.println(data.values()); // [10, 3, 4, 5,6]

        // Get all the entries in the hashmap
        System.out.println(data.entrySet()); // [one=10, three=3, four=4, five=5,six=6]

        //Traversing all entries of Hashmap - multiple methods

        for(String key:data.keySet()){
            System.out.println(key+" "+data.get(key));
        }

        for(Map.Entry<String,Integer> e : data.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }

        for(var e:data.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }
    }
    public static void main(String[] args) {
        hashMapMethods();
    }
}
