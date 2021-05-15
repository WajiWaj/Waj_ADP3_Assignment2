package za.ac.cput.WajedienSamuels;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;


class Assignment2Test {

    List<String> list = new LinkedList<>();
    Set<Integer> set = new HashSet<>();
    HashMap<String, String> map = new HashMap<>();

    @BeforeEach
    void setUp() {

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

    }

    @Test
    @DisplayName("List Test")
    void testAddList(){
        list.add("Fourth");
        System.out.println(list);
    }

    @Test
    @DisplayName("List Test")
    void testRemoveList(){
        System.out.println(list);
        list.remove("Second");
        System.out.println(list);
    }

    @Test
    @DisplayName("List Test")
    void testFindList(){
        //list.add("Element 4");
        System.out.println(list.contains("First"));
    }

    @Test
    @DisplayName("Set Test")
    void testAddSet(){
        set.add(4);
        System.out.println(set);
    }

    @Test
    @DisplayName("Set Test")
    void testRemoveSet(){
        set.remove(2);
        System.out.println(set);
    }

    @Test
    @DisplayName("Set Test")
    void testFindSet(){
        System.out.println(set.contains(1));
    }

    @Test
    @DisplayName("Map Test")
    void testAddMap(){
        map.put("Fourth", "Four");
        System.out.println(map);
    }

    @Test
    @DisplayName("Map Test")
    void testRemoveMap(){
        map.remove("Second");
        System.out.println(map);
    }

    @Test
    @DisplayName("Map Test")
    void testFindMap(){
        //map.containsKey(1);
        System.out.println(map.containsKey("First"));
    }
}