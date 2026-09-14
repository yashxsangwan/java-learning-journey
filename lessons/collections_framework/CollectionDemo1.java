package lessons.collections_framework;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*
        Collection API are concepts, Collection is an interface, Collections are classes
        Collection topmost then subinterfaces like List, Set, Queue. Not part of collection- Map interface
        Then comes classes which extends these interfaces like ArrayList, LinkedList, HashSet, TreeSet, etc
        */
        List<Integer> obj = new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);

        System.out.println(obj);

        Set<Integer> obj2 = new HashSet<>();
        obj2.add(2);
        obj2.add(4);
        obj2.add(6);
        obj2.add(2);
        obj2.add(10);

        System.out.println(obj2);

        
    }
    
}
