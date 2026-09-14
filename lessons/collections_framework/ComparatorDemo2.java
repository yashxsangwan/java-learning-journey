package lessons.collections_framework;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Students {
    int age;
    String name;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override 
    public String toString() {
        return ("Student name = " + name + " and age = " + age);
    }
}

public class ComparatorDemo2 {
    public static void main(String[] args) {
        List<Students> studs = new ArrayList<Students>();

        /* 
        Comparator<Students> com = new Comparator<>() 
        {
            public int compare(Students i, Students j) {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };
        */

        // Lambda expression used here
        /*
        Comparator<Students> com = (Students i, Students j) -> {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            };
        */

        /*
        Comparator<Students> com = (Students i, Students j) -> {
                return i.age > j.age ? 1 : -1;
            };
        */

        // Needs much practice of Lambda expression to use like this
        Comparator<Students> com = (i, j) -> i.age > j.age ? 1 : -1;

        studs.add(new Students("Rahul", 29));
        studs.add(new Students("Vishal", 37));
        studs.add(new Students("Preeti", 21));
        studs.add(new Students("Kiran", 24));

        Collections.sort(studs, com);

        for(Students s : studs) 
            System.out.println(s);
    }
    
}
