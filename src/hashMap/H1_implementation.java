/*store key-value pair*/
package hashMap;

import java.util.HashMap;
import java.util.*;

public class H1_implementation {
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map= new HashMap<>();

        //insertion
        map.put("india",120);
        map.put("china",150);
        map.put("US",90);
        System.out.println(map);

        map.put("china",250);//update  value of china
        System.out.println(map);

        //search operation
        if(map.containsKey("china")){
            System.out.println("present in the map");
        }else{
            System.out.println("not present in the map");
        }



        //to get value of any key
        System.out.println(map.get("china")); //key exist
        System.out.println(map.get("canada")); //key noe exist

        //iteration--example of array
        int[] arr={4,5,6};
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();

        //hashmap iteration
        for(Map.Entry<String,Integer> e :map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue());
            System.out.println();
        }

        //another method
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        //remove any pair
        map.remove("china");
        System.out.println(map);
        System.out.println( map.size());
    }
}
