package JAVAandDSAKHAPRA;
import java.util.*;
public class _50_Hashmap {
    public static void main(String[] args) {
        //country(key) population(value)
        HashMap<String ,Integer> map = new HashMap<>();
        //insertions
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);
        //search
        if(map.containsKey("India")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }
        System.out.println(map.get("China"));
        System.out.println(map.get("Pakistan"));
        for(Map.Entry<String,Integer> e: map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
            Set<String> Keys = map.keySet();
            for(String Key : Keys) {
                System.out.println(Key+" " +map.get(Key));
                
            }
        }
        }

