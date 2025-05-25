package CollectionsAssignment;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment {
    public static void main(String[] args) {
        //Given a list of integers, count the frequency of each element and display the results in ascending order of elements.
       /* int arr[] ={4, 2, 2, 8, 3, 3, 3, 4};
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() +"-> "+ entry.getValue());
        };*/

        //Given a list of strings, remove duplicates while maintaining insertion order.
        //Input: ["apple", "banana", "apple", "orange", "banana"]
        //Expected Output:
        //["apple", "banana", "orange"]

        String [] str = {"apple","banana","apple","orange", "banana"};
        Set<String> set = new LinkedHashSet<>();
        for(int i=0;i<str.length;i++){
            set.add(str[i]);
        }
        System.out.println(set);


    }
}
