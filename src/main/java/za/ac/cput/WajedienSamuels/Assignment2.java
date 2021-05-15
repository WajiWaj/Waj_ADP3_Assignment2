package za.ac.cput.WajedienSamuels;

import java.util.*;

public class Assignment2 {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();

        //Added Strings to list
        list.add("First");
        list.add("Second");
        list.add("Third");

        //Adding integers to set
        set.add(1);
        set.add(2);
        set.add(3);

        //Adding elements to map
        map.put( "First" , "One");
        map.put( "Second" , "Two");
        map.put( "Third" , "Three");

        System.out.println("List" + list);
        System.out.println("Set" + set);
        System.out.println("Map" + map);


    }
}
